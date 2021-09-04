use std::collections::HashSet;
use proconio::input;

fn main() {
    input! {
        s1: String,
        s2: String,
        s3: String,
    }

    let a: HashSet<_> = ["ABC".to_string(), "ARC".to_string(), "AGC".to_string(), "AHC".to_string()].iter().cloned().collect();
    let b: HashSet<_> = [s1, s2, s3].iter().cloned().collect();

    println!("{}", a.difference(&b).collect::<Vec<_>>()[0])
}
