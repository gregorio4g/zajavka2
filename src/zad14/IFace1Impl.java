package zad14;

import org.jetbrains.annotations.NotNull;

public class IFace1Impl implements IFace1 {
	@Override
	public @NotNull String iFace1(int i) {
		return new StringBuilder().appendCodePoint(Math.abs(i) + 32).toString().repeat(Math.abs(i));
	}
}
