use std::env;

fn to_binary_vec(num: i32) -> Vec<i32> {
    let mut integral = num;
    let mut vec = Vec::new();
    while integral != 0 {
        let remainder = integral % 2;
        vec.push(remainder);
        integral = integral / 2;
    };
    vec.reverse();
    vec
}

fn largest_binary_gaps(binary_vec: Vec<i32>) -> i32 {
   let mut binary_count = 0;
   let mut largest_count = 0;
   for i in 0..binary_vec.len()-1 {
     if binary_vec[i] == 1 {
        if binary_vec[i+1] == 0 {
            binary_count +=1;
        }
     }

     if binary_vec[i] == 0 {
        if binary_vec[i+1] == 1 {
            if binary_count > largest_count {
                largest_count = binary_count;
            }
            binary_count = 0;
        } else {
            binary_count +=1;
        }
     }
   }
   largest_count
}

fn main() {
    let args: Vec<String> = env::args().collect();
    let num: i32 = args.last().unwrap().parse::<i32>().unwrap();
    let vec = to_binary_vec(num);
    let solution = largest_binary_gaps(vec);
    println!("largest binary gap is {}", solution);
}

