$stdout.sync = true

n, q = gets.chomp.split(" ").map(&:to_i)

characters = ("A".."Z").to_a.take(n)

puts case q
     when 1000
       sort = ->(index, max, sortedList) {
         if max == 0
           sortedList
         elsif index == max
           sort.call(0, max - 1, sortedList)
         else
           puts "? #{sortedList[index]} #{sortedList[index + 1]}"
           sortedList[index], sortedList[index + 1] = sortedList[index + 1], sortedList[index] if gets.chomp == ">"
           sort.call(index +1, max, sortedList)
         end
       }

       sorted = sort.call(0, characters.length - 1, characters)
       "! #{sorted.join}"
     when 100
       ""
     when 7
       ""
     else
       ""
     end
