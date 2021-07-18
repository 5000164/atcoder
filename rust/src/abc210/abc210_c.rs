use itertools::Itertools;
use proconio::input;

fn main() {
    input! {
        n: i32,
        k: i32,
        c: [i32; n]
    }

    let (_, max) = c.iter().fold((vec![], 0), |(old_candies, max), &candy| {
        let new_candies = old_candies
            .into_iter()
            .chain(vec![candy].into_iter())
            .collect::<Vec<i32>>();
        if new_candies.len() as i32 == k {
            let unique = new_candies.iter().unique().collect_vec().len();
            (
                new_candies.into_iter().skip(1).collect_vec(),
                if unique > max { unique } else { max },
            )
        } else {
            (new_candies, max)
        }
    });

    println!("{}", max)
}
