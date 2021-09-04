use std::collections::HashMap;
use proconio::input;

fn main() {
    input! {
        n: usize,
        p: [usize; n]
    }

    let mut d: HashMap<usize, usize> = HashMap::new();

    p.iter().enumerate().for_each(|(i, &it)| {
        d.insert(it, i + 1);
    });

    let mut q = d.into_iter().collect::<Vec<_>>();
    q.sort_by(|x, y| x.0.cmp(&y.0));

    println!("{}", q.iter().map(|(_, it)| it.to_string()).collect::<Vec<_>>().join(" "))
}
