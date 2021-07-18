use proconio::input;

fn main() {
    input! {
        _n: i32,
        s: String
    }

    println!(
        "{}",
        if s.find('1').unwrap() % 2 == 0 {
            "Takahashi"
        } else {
            "Aoki"
        }
    )
}
