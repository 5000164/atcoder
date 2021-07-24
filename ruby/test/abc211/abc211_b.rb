require "../assert"

IO.popen("ruby ../../abc211/abc211_b.rb", "r+") { |io|
  io.puts "3B"
  io.puts "HR"
  io.puts "2B"
  io.puts "H"
  assert "Yes\n", io.gets
  io.close
}

IO.popen("ruby ../../abc211/abc211_b.rb", "r+") { |io|
  io.puts "2B"
  io.puts "3B"
  io.puts "HR"
  io.puts "3B"
  assert "No\n", io.gets
  io.close
}
