fn main() {
    
    let condition = true; 
    let number = if condition {5} else {6};
    println!("The value of number is: {number}");

    let mut counter = 0; 
    let result = loop {
        counter += 1; 

        if counter == 10 {
            break counter * 2; 
        }
    };
    println!("The result is {result}");

    let mut number = 3; 
    while number != 0 {
        println!("{number}");
        number -= 1; 
    }
    println!("LIFTOFF!!!");

    let a = [10, 20, 30, 40, 50];
    let mut index = 0; 
    while index < 5 {
        println!("The value is: {}", a[index]);
        index += 1; 
    }
    for element in a {
        println!("The value is: {}", element + 50);
    }
}
