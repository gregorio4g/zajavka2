package zad14;

import org.jetbrains.annotations.NotNull;

public class IFace2Impl implements IFace2 {
  @Override
  public @NotNull String iFace2(int i, @NotNull String s) {
    if(i == 0) {
      return "";
    }

    int d = Math.abs(i)/s.length();
    StringBuilder sb = new StringBuilder(s.repeat(d + 1));
    StringBuilder sb2 = new StringBuilder(sb.substring(0, Math.abs(i)));
    if(i < 0) {
      return sb2.reverse().toString();
    }
    return sb2.toString();
  }
}
