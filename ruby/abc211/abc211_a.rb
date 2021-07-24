a, b = gets.chomp.split(' ').map(&:to_i)
r = ((a - b) / 3.to_f) + b
puts "#{(r % 1).zero? ? r.to_i : r.round(7)}\n"
