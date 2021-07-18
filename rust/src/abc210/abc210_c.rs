use proconio::input;
use std::collections::HashMap;
use std::collections::VecDeque;

fn main() {
    input! {
        n: i32,
        k: i32,
        c: [i32; n]
    }

    let colors: HashMap<i32, i32> = HashMap::new();
    let queue: VecDeque<i32> = VecDeque::new();

    let (_, _, max) = c.iter().fold(
        (colors, queue, 0),
        |(mut colors, mut queue, max), &color| {
            colors.insert(
                color,
                if colors.contains_key(&color) {
                    colors[&color]
                } else {
                    0
                } + 1,
            );
            queue.push_front(color);
            if queue.len() as i32 == k {
                let colors_count = colors.len();
                let remove_color = queue.pop_back().unwrap();
                if colors[&remove_color] > 1 {
                    colors.insert(remove_color, colors[&remove_color] - 1)
                } else {
                    colors.remove(&remove_color)
                };
                (
                    colors,
                    queue,
                    if colors_count > max {
                        colors_count
                    } else {
                        max
                    },
                )
            } else {
                (colors, queue, max)
            }
        },
    );

    println!("{}", max)
}
