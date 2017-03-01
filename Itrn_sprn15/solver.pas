var a, b, c, d: integer;
  x, y, tmp:real;

  begin
    readln(a, b, c);
    d := b*b - 4*a*c;
    if d < 0 then
      writeln(0)
    else
      if d = 0 then
      begin
        writeln(1);
        x := -b / (2*a);
        writeln(x);
      end
      else
        begin
          writeln(2);
          x := ((-1)*b + sqrt(d)) / (2*a);
          y := ((-1)*b - sqrt(d)) / (2*a);
          if x > y then
          begin
            tmp := x;
            x := y;
            y := tmp;
          end;
          writeln(x:5:5, ' ', y:5:5);
        end
  end.
      