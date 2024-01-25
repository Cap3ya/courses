/*
Decorator is a wrapper around a function that alters its behavior. The main job is still carried out by the function.

Decorators can be seen as “features” or “aspects” that can be added to a function. We can add one or add many. And all this without changing its code!

To implement cachingDecorator, we studied methods:

func.call(context, arg1, arg2…) – calls func with given context and arguments.
func.apply(context, args) – calls func passing context as this and array-like args into a list of arguments.

The generic call forwarding is usually done with apply:

let wrapper = function() {
  return original.apply(this, arguments);
};

We also saw an example of method borrowing when we take a method from an object and call it in the context of another object. It is quite common to take array methods and apply them to arguments. The alternative is to use rest parameters object that is a real array.

There are many decorators there in the wild. Check how well you got them by solving the tasks of this chapter.
*/

let worker = {
    slow(min, max) {
        alert(`Called with ${min},${max}`);
        return min + max;
    }
};

function cachingDecorator(func, hash) {
    let cache = new Map();
    return function () {
        let key = hash(arguments); // (*)
        if (cache.has(key)) {
            return cache.get(key);
        }

        let result = func.call(this, ...arguments);
        // or faster with args[] - func.apply(this, arguments); 

        cache.set(key, result);
        return result;
    };
}

function hash(args) {
    return [].join.call(args); // Borrowing a method
}

worker.slow = cachingDecorator(worker.slow, hash);

alert(worker.slow(3, 5)); // works
alert("Again " + worker.slow(3, 5)); // same (cached)

// SPY DECORATOR

function spy(func) {
    function wrapper (...args) {
        wrapper.calls.push(args);
        return func.apply(this, args);
    }
    wrapper.calls = [];
    return wrapper;
}

// DELAYING DECORATOR

function delay(f, ms) {
    return function() {
        setTimeout(()=> f.apply(this, arguments), ms);
    }
}

let f1000 = delay(alert, 1000);
f1000("test");
