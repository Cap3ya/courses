fn main() {

    let arr: [u32; 5] = [1,2,3,4,5];

    println!("Enter an array index.");

    let mut index = String::new(); 

    std::io::stdin()
        .read_line(&mut index)
        .expect("Failed to read line");

    let index: usize = index
        .trim()
        .parse()
        .expect("Index entered was not a number");

    let element = arr[index];

    println!("The value of the element at index {index} is : {element}");
}
