import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

public final class Static12 {

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private static int anInt576;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!mb;")
	private static Buffer aBuffer_8;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	private static NpcConfig[] aNpcConfigArray1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private static int anInt577;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private static int anInt575 = 6;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "Lclient!t;")
	public static Class42 aClass42_6 = new Class42((byte) 3, 30);

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method318(@OriginalArg(0) Class48 arg0) {
		aBuffer_8 = new Buffer(arg0.method678("npc.dat", null), (byte) 3);
		@Pc(19) Buffer local19 = new Buffer(arg0.method678("npc.idx", null), (byte) 3);
		anInt576 = local19.readUShortBE();
		anIntArray165 = new int[anInt576];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt576; local29++) {
			anIntArray165[local29] = local27;
			local27 += local19.readUShortBE();
		}
		aNpcConfigArray1 = new NpcConfig[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aNpcConfigArray1[local49] = new NpcConfig();
		}
//		System.out.println(anInt576);
//		for(int i = 0; i < anInt576; i++) {
//			Class13 npcDef = method320(i);
//			System.out.println(i + " " + npcDef.name);
//		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)V")
	public static void method319(@OriginalArg(0) int arg0) {
		try {
			aClass42_6 = null;
			anIntArray165 = null;
			if (arg0 <= 0) {
				anInt575 = -75;
			}
			aNpcConfigArray1 = null;
			aBuffer_8 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("49336, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!gc;")
	public static NpcConfig method320(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aNpcConfigArray1[local1].aLong25 == (long) arg0) {
				return aNpcConfigArray1[local1];
			}
		}
		anInt577 = (anInt577 + 1) % 20;
		@Pc(33) NpcConfig local33 = aNpcConfigArray1[anInt577] = new NpcConfig();
		aBuffer_8.position = anIntArray165[arg0];
		local33.aLong25 = arg0;
		local33.method321(9, aBuffer_8);
		return local33;
	}
}
