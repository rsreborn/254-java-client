import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!mb;Z)V")
	public Class12(@OriginalArg(0) Buffer arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				throw new NullPointerException();
			}
			this.anInt564 = arg0.readUByte();
			this.anIntArray164 = new int[this.anInt564];
			this.anIntArrayArray11 = new int[this.anInt564][];
			for (@Pc(25) int local25 = 0; local25 < this.anInt564; local25++) {
				this.anIntArray164[local25] = arg0.readUByte();
			}
			for (@Pc(40) int local40 = 0; local40 < this.anInt564; local40++) {
				@Pc(45) int local45 = arg0.readUByte();
				this.anIntArrayArray11[local40] = new int[local45];
				for (@Pc(53) int local53 = 0; local53 < local45; local53++) {
					this.anIntArrayArray11[local40][local53] = arg0.readUByte();
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("51078, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
