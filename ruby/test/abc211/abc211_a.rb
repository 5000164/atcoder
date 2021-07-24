require "../assert"

IO.popen("ruby ../../abc211/abc211_a.rb", "r+") { |io|
  io.puts "130 100"
  assert "110\n", io.gets
  io.close
}

IO.popen("ruby ../../abc211/abc211_a.rb", "r+") { |io|
  io.puts "300 50"
  assert "133.3333333\n", io.gets
  io.close
}

IO.popen("ruby ../../abc211/abc211_a.rb", "r+") { |io|
  io.puts "123 123"
  assert "123\n", io.gets
  io.close
}
