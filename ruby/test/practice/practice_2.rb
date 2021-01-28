require "../assert"

n, q = 26, 1000
io = IO.popen("/usr/local/bin/ruby /opt/project/practice/practice_2.rb", "r+")
io.puts "#{n} #{q}"
input = io.gets.chomp
count = 1
while input.start_with?("?") do
  *, x, y = input.split(" ")
  # A .. Z を逆順にする
  io.puts x > y ? "<" : ">"
  input = io.gets.chomp
  count += 1
end
assert "! ZYXWVUTSRQPONMLKJIHGFEDCBA", input
assert true, count <= 1000
io.close
