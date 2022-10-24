package zad14;

public class IFace1Impl implements IFace1 {
	@Override
	public String iFace1(int i) {
		return new StringBuilder().appendCodePoint(i + 32).toString().repeat(i);
	}
}
