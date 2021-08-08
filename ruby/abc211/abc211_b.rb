require 'set'
set = Set.new
set.add(gets.chomp)
set.add(gets.chomp)
set.add(gets.chomp)
set.add(gets.chomp)
puts "#{set.length == 4 ? "Yes" : "No"}\n"
