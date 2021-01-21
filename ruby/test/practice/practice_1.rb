require "../assert"

io = IO.popen("/usr/local/bin/ruby /opt/project/practice/practice_1.rb", "r+")
io.puts "1"
io.puts "2 3"
io.puts "test"
assert "6 test\n", io.gets
io.close
