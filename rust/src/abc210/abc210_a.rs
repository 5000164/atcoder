use proconio::input;

fn main() {
    input! {
        n: i32,
        a: i32,
        x: i32,
        y: i32
    }

    println!("{}", if n > a { a * x + (n - a) * y } else { n * x })
}
