import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	public int anInt544;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!fb", name = "P", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
	public int anInt552;

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!fb", name = "Z", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!fb", name = "ab", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!fb", name = "bb", descriptor = "[[I")
	public int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!fb", name = "cb", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!fb", name = "eb", descriptor = "[Lclient!o;")
	public Class28[] aClass28Array9;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	private int anInt540 = -48;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!fb", name = "db", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Z)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				for (@Pc(14) int local14 = 1; local14 > 0; local14++) {
				}
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("82428, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IZ)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			Static11.anInt542++;
			@Pc(20) Class24 local20 = Static11.aClass24Array1[arg0];
			this.anInt543 = local20.anInt754;
			this.anInt544 = local20.anInt755;
			this.anInt546 = local20.anInt756;
			this.anIntArray125 = new int[this.anInt543];
			this.anIntArray126 = new int[this.anInt543];
			this.anIntArray127 = new int[this.anInt543];
			this.anIntArray128 = new int[this.anInt544];
			this.anIntArray129 = new int[this.anInt544];
			this.anIntArray130 = new int[this.anInt544];
			this.anIntArray138 = new int[this.anInt546];
			this.anIntArray139 = new int[this.anInt546];
			this.anIntArray140 = new int[this.anInt546];
			if (local20.anInt761 >= 0) {
				this.anIntArray141 = new int[this.anInt543];
			}
			if (local20.anInt765 >= 0) {
				this.anIntArray134 = new int[this.anInt544];
			}
			if (local20.anInt766 >= 0) {
				this.anIntArray135 = new int[this.anInt544];
			} else {
				this.anInt545 = -local20.anInt766 - 1;
			}
			if (local20.anInt767 >= 0) {
				this.anIntArray136 = new int[this.anInt544];
			}
			if (local20.anInt768 >= 0) {
				this.anIntArray142 = new int[this.anInt544];
			}
			this.anIntArray137 = new int[this.anInt544];
			@Pc(138) Buffer local138 = new Buffer(local20.aByteArray8, (byte) 3);
			local138.position = local20.anInt757;
			@Pc(149) Buffer local149 = new Buffer(local20.aByteArray8, (byte) 3);
			local149.position = local20.anInt758;
			@Pc(160) Buffer local160 = new Buffer(local20.aByteArray8, (byte) 3);
			local160.position = local20.anInt759;
			@Pc(171) Buffer local171 = new Buffer(local20.aByteArray8, (byte) 3);
			local171.position = local20.anInt760;
			@Pc(182) Buffer local182 = new Buffer(local20.aByteArray8, (byte) 3);
			local182.position = local20.anInt761;
			@Pc(188) int local188 = 0;
			@Pc(190) int local190 = 0;
			@Pc(192) int local192 = 0;
			@Pc(196) int local196;
			if (arg1) {
				for (local196 = 1; local196 > 0; local196++) {
				}
			}
			@Pc(208) int local208;
			@Pc(210) int local210;
			@Pc(219) int local219;
			@Pc(228) int local228;
			for (local196 = 0; local196 < this.anInt543; local196++) {
				local208 = local138.readUByte();
				local210 = 0;
				if ((local208 & 0x1) != 0) {
					local210 = local149.readSmart();
				}
				local219 = 0;
				if ((local208 & 0x2) != 0) {
					local219 = local160.readSmart();
				}
				local228 = 0;
				if ((local208 & 0x4) != 0) {
					local228 = local171.readSmart();
				}
				this.anIntArray125[local196] = local188 + local210;
				this.anIntArray126[local196] = local190 + local219;
				this.anIntArray127[local196] = local192 + local228;
				local188 = this.anIntArray125[local196];
				local190 = this.anIntArray126[local196];
				local192 = this.anIntArray127[local196];
				if (this.anIntArray141 != null) {
					this.anIntArray141[local196] = local182.readUByte();
				}
			}
			local138.position = local20.anInt764;
			local149.position = local20.anInt765;
			local160.position = local20.anInt766;
			local171.position = local20.anInt767;
			local182.position = local20.anInt768;
			for (local208 = 0; local208 < this.anInt544; local208++) {
				this.anIntArray137[local208] = local138.readUShortLE();
				if (this.anIntArray134 != null) {
					this.anIntArray134[local208] = local149.readUByte();
				}
				if (this.anIntArray135 != null) {
					this.anIntArray135[local208] = local160.readUByte();
				}
				if (this.anIntArray136 != null) {
					this.anIntArray136[local208] = local171.readUByte();
				}
				if (this.anIntArray142 != null) {
					this.anIntArray142[local208] = local182.readUByte();
				}
			}
			local138.position = local20.anInt762;
			local149.position = local20.anInt763;
			local210 = 0;
			local219 = 0;
			local228 = 0;
			@Pc(372) int local372 = 0;
			@Pc(379) int local379;
			for (@Pc(374) int local374 = 0; local374 < this.anInt544; local374++) {
				local379 = local149.readUByte();
				if (local379 == 1) {
					local210 = local138.readSmart() + local372;
					local219 = local138.readSmart() + local210;
					local228 = local138.readSmart() + local219;
					local372 = local228;
					this.anIntArray128[local374] = local210;
					this.anIntArray129[local374] = local219;
					this.anIntArray130[local374] = local228;
				}
				if (local379 == 2) {
					local210 = local210;
					local219 = local228;
					local228 = local138.readSmart() + local372;
					local372 = local228;
					this.anIntArray128[local374] = local210;
					this.anIntArray129[local374] = local219;
					this.anIntArray130[local374] = local228;
				}
				if (local379 == 3) {
					local210 = local228;
					local219 = local219;
					local228 = local138.readSmart() + local372;
					local372 = local228;
					this.anIntArray128[local374] = local210;
					this.anIntArray129[local374] = local219;
					this.anIntArray130[local374] = local228;
				}
				if (local379 == 4) {
					@Pc(481) int local481 = local210;
					local210 = local219;
					local219 = local481;
					local228 = local138.readSmart() + local372;
					local372 = local228;
					this.anIntArray128[local374] = local210;
					this.anIntArray129[local374] = local481;
					this.anIntArray130[local374] = local228;
				}
			}
			local138.position = local20.anInt769;
			for (local379 = 0; local379 < this.anInt546; local379++) {
				this.anIntArray138[local379] = local138.readUShortLE();
				this.anIntArray139[local379] = local138.readUShortLE();
				this.anIntArray140[local379] = local138.readUShortLE();
			}
		} catch (@Pc(545) RuntimeException local545) {
			signlink.reporterror("71741, " + arg0 + ", " + arg1 + ", " + local545.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([Lclient!fb;II)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) Class1_Sub1_Sub1_Sub5[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			while (arg2 >= 0) {
				Static11.anInt541 = 324;
			}
			Static11.anInt542++;
			@Pc(24) boolean local24 = false;
			@Pc(26) boolean local26 = false;
			@Pc(28) boolean local28 = false;
			@Pc(30) boolean local30 = false;
			this.anInt543 = 0;
			this.anInt544 = 0;
			this.anInt546 = 0;
			this.anInt545 = -1;
			for (@Pc(44) int local44 = 0; local44 < arg1; local44++) {
				@Pc(50) Class1_Sub1_Sub1_Sub5 local50 = arg0[local44];
				if (local50 != null) {
					this.anInt543 += local50.anInt543;
					this.anInt544 += local50.anInt544;
					this.anInt546 += local50.anInt546;
					local24 |= local50.anIntArray134 != null;
					if (local50.anIntArray135 == null) {
						if (this.anInt545 == -1) {
							this.anInt545 = local50.anInt545;
						}
						if (this.anInt545 != local50.anInt545) {
							local26 = true;
						}
					} else {
						local26 = true;
					}
					local28 |= local50.anIntArray136 != null;
					local30 |= local50.anIntArray142 != null;
				}
			}
			this.anIntArray125 = new int[this.anInt543];
			this.anIntArray126 = new int[this.anInt543];
			this.anIntArray127 = new int[this.anInt543];
			this.anIntArray141 = new int[this.anInt543];
			this.anIntArray128 = new int[this.anInt544];
			this.anIntArray129 = new int[this.anInt544];
			this.anIntArray130 = new int[this.anInt544];
			this.anIntArray138 = new int[this.anInt546];
			this.anIntArray139 = new int[this.anInt546];
			this.anIntArray140 = new int[this.anInt546];
			if (local24) {
				this.anIntArray134 = new int[this.anInt544];
			}
			if (local26) {
				this.anIntArray135 = new int[this.anInt544];
			}
			if (local28) {
				this.anIntArray136 = new int[this.anInt544];
			}
			if (local30) {
				this.anIntArray142 = new int[this.anInt544];
			}
			this.anIntArray137 = new int[this.anInt544];
			this.anInt543 = 0;
			this.anInt544 = 0;
			this.anInt546 = 0;
			for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
				@Pc(226) Class1_Sub1_Sub1_Sub5 local226 = arg0[local220];
				if (local226 != null) {
					for (@Pc(230) int local230 = 0; local230 < local226.anInt544; local230++) {
						if (local24) {
							if (local226.anIntArray134 == null) {
								this.anIntArray134[this.anInt544] = 0;
							} else {
								this.anIntArray134[this.anInt544] = local226.anIntArray134[local230];
							}
						}
						if (local26) {
							if (local226.anIntArray135 == null) {
								this.anIntArray135[this.anInt544] = local226.anInt545;
							} else {
								this.anIntArray135[this.anInt544] = local226.anIntArray135[local230];
							}
						}
						if (local28) {
							if (local226.anIntArray136 == null) {
								this.anIntArray136[this.anInt544] = 0;
							} else {
								this.anIntArray136[this.anInt544] = local226.anIntArray136[local230];
							}
						}
						if (local30 && local226.anIntArray142 != null) {
							this.anIntArray142[this.anInt544] = local226.anIntArray142[local230];
						}
						this.anIntArray137[this.anInt544] = local226.anIntArray137[local230];
						this.anIntArray128[this.anInt544] = this.method291(local226, local226.anIntArray128[local230]);
						this.anIntArray129[this.anInt544] = this.method291(local226, local226.anIntArray129[local230]);
						this.anIntArray130[this.anInt544] = this.method291(local226, local226.anIntArray130[local230]);
						this.anInt544++;
					}
					for (@Pc(371) int local371 = 0; local371 < local226.anInt546; local371++) {
						this.anIntArray138[this.anInt546] = this.method291(local226, local226.anIntArray138[local371]);
						this.anIntArray139[this.anInt546] = this.method291(local226, local226.anIntArray139[local371]);
						this.anIntArray140[this.anInt546] = this.method291(local226, local226.anIntArray140[local371]);
						this.anInt546++;
					}
				}
			}
		} catch (@Pc(426) RuntimeException local426) {
			signlink.reporterror("51018, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local426.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(BI[Lclient!fb;Z)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub5[] arg2, @OriginalArg(3) boolean arg3) {
		try {
			Static11.anInt542++;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			@Pc(24) boolean local24 = false;
			this.anInt543 = 0;
			this.anInt544 = 0;
			this.anInt546 = 0;
			this.anInt545 = -1;
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = arg2[local38];
				if (local44 != null) {
					this.anInt543 += local44.anInt543;
					this.anInt544 += local44.anInt544;
					this.anInt546 += local44.anInt546;
					local18 |= local44.anIntArray134 != null;
					if (local44.anIntArray135 == null) {
						if (this.anInt545 == -1) {
							this.anInt545 = local44.anInt545;
						}
						if (this.anInt545 != local44.anInt545) {
							local20 = true;
						}
					} else {
						local20 = true;
					}
					local22 |= local44.anIntArray136 != null;
					local24 |= local44.anIntArray137 != null;
				}
			}
			this.anIntArray125 = new int[this.anInt543];
			if (arg0 == 9) {
				@Pc(130) boolean local130 = false;
			} else {
				Static11.anInt541 = -379;
			}
			this.anIntArray126 = new int[this.anInt543];
			this.anIntArray127 = new int[this.anInt543];
			this.anIntArray128 = new int[this.anInt544];
			this.anIntArray129 = new int[this.anInt544];
			this.anIntArray130 = new int[this.anInt544];
			this.anIntArray131 = new int[this.anInt544];
			this.anIntArray132 = new int[this.anInt544];
			this.anIntArray133 = new int[this.anInt544];
			this.anIntArray138 = new int[this.anInt546];
			this.anIntArray139 = new int[this.anInt546];
			this.anIntArray140 = new int[this.anInt546];
			if (local18) {
				this.anIntArray134 = new int[this.anInt544];
			}
			if (local20) {
				this.anIntArray135 = new int[this.anInt544];
			}
			if (local22) {
				this.anIntArray136 = new int[this.anInt544];
			}
			if (local24) {
				this.anIntArray137 = new int[this.anInt544];
			}
			this.anInt543 = 0;
			this.anInt544 = 0;
			this.anInt546 = 0;
			for (@Pc(228) int local228 = 0; local228 < arg1; local228++) {
				@Pc(234) Class1_Sub1_Sub1_Sub5 local234 = arg2[local228];
				if (local234 != null) {
					@Pc(239) int local239 = this.anInt543;
					for (@Pc(241) int local241 = 0; local241 < local234.anInt543; local241++) {
						this.anIntArray125[this.anInt543] = local234.anIntArray125[local241];
						this.anIntArray126[this.anInt543] = local234.anIntArray126[local241];
						this.anIntArray127[this.anInt543] = local234.anIntArray127[local241];
						this.anInt543++;
					}
					for (@Pc(283) int local283 = 0; local283 < local234.anInt544; local283++) {
						this.anIntArray128[this.anInt544] = local234.anIntArray128[local283] + local239;
						this.anIntArray129[this.anInt544] = local234.anIntArray129[local283] + local239;
						this.anIntArray130[this.anInt544] = local234.anIntArray130[local283] + local239;
						this.anIntArray131[this.anInt544] = local234.anIntArray131[local283];
						this.anIntArray132[this.anInt544] = local234.anIntArray132[local283];
						this.anIntArray133[this.anInt544] = local234.anIntArray133[local283];
						if (local18) {
							if (local234.anIntArray134 == null) {
								this.anIntArray134[this.anInt544] = 0;
							} else {
								this.anIntArray134[this.anInt544] = local234.anIntArray134[local283];
							}
						}
						if (local20) {
							if (local234.anIntArray135 == null) {
								this.anIntArray135[this.anInt544] = local234.anInt545;
							} else {
								this.anIntArray135[this.anInt544] = local234.anIntArray135[local283];
							}
						}
						if (local22) {
							if (local234.anIntArray136 == null) {
								this.anIntArray136[this.anInt544] = 0;
							} else {
								this.anIntArray136[this.anInt544] = local234.anIntArray136[local283];
							}
						}
						if (local24 && local234.anIntArray137 != null) {
							this.anIntArray137[this.anInt544] = local234.anIntArray137[local283];
						}
						this.anInt544++;
					}
					for (@Pc(439) int local439 = 0; local439 < local234.anInt546; local439++) {
						this.anIntArray138[this.anInt546] = local234.anIntArray138[local439] + local239;
						this.anIntArray139[this.anInt546] = local234.anIntArray139[local439] + local239;
						this.anIntArray140[this.anInt546] = local234.anIntArray140[local439] + local239;
						this.anInt546++;
					}
				}
			}
			this.method292(-15382);
		} catch (@Pc(494) RuntimeException local494) {
			signlink.reporterror("32484, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local494.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(ZIZZLclient!fb;)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class1_Sub1_Sub1_Sub5 arg4) {
		try {
			Static11.anInt542++;
			this.anInt543 = arg4.anInt543;
			this.anInt544 = arg4.anInt544;
			this.anInt546 = arg4.anInt546;
			@Pc(61) int local61;
			if (arg2) {
				this.anIntArray125 = arg4.anIntArray125;
				this.anIntArray126 = arg4.anIntArray126;
				this.anIntArray127 = arg4.anIntArray127;
			} else {
				this.anIntArray125 = new int[this.anInt543];
				this.anIntArray126 = new int[this.anInt543];
				this.anIntArray127 = new int[this.anInt543];
				for (local61 = 0; local61 < this.anInt543; local61++) {
					this.anIntArray125[local61] = arg4.anIntArray125[local61];
					this.anIntArray126[local61] = arg4.anIntArray126[local61];
					this.anIntArray127[local61] = arg4.anIntArray127[local61];
				}
			}
			if (arg3) {
				this.anIntArray137 = arg4.anIntArray137;
			} else {
				this.anIntArray137 = new int[this.anInt544];
				for (local61 = 0; local61 < this.anInt544; local61++) {
					this.anIntArray137[local61] = arg4.anIntArray137[local61];
				}
			}
			if (arg0) {
				this.anIntArray136 = arg4.anIntArray136;
			} else {
				this.anIntArray136 = new int[this.anInt544];
				if (arg4.anIntArray136 == null) {
					for (local61 = 0; local61 < this.anInt544; local61++) {
						this.anIntArray136[local61] = 0;
					}
				} else {
					for (local61 = 0; local61 < this.anInt544; local61++) {
						this.anIntArray136[local61] = arg4.anIntArray136[local61];
					}
				}
			}
			this.anIntArray141 = arg4.anIntArray141;
			this.anIntArray142 = arg4.anIntArray142;
			this.anIntArray134 = arg4.anIntArray134;
			this.anIntArray128 = arg4.anIntArray128;
			this.anIntArray129 = arg4.anIntArray129;
			this.anIntArray130 = arg4.anIntArray130;
			this.anIntArray135 = arg4.anIntArray135;
			this.anInt545 = arg4.anInt545;
			@Pc(206) int local206 = 2 / arg1;
			this.anIntArray138 = arg4.anIntArray138;
			this.anIntArray139 = arg4.anIntArray139;
			this.anIntArray140 = arg4.anIntArray140;
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("59810, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(BZLclient!fb;Z)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub5 arg2, @OriginalArg(3) boolean arg3) {
		try {
			Static11.anInt542++;
			this.anInt543 = arg2.anInt543;
			this.anInt544 = arg2.anInt544;
			this.anInt546 = arg2.anInt546;
			@Pc(37) int local37;
			if (arg1) {
				this.anIntArray126 = new int[this.anInt543];
				for (local37 = 0; local37 < this.anInt543; local37++) {
					this.anIntArray126[local37] = arg2.anIntArray126[local37];
				}
			} else {
				this.anIntArray126 = arg2.anIntArray126;
			}
			if (arg3) {
				this.anIntArray131 = new int[this.anInt544];
				this.anIntArray132 = new int[this.anInt544];
				this.anIntArray133 = new int[this.anInt544];
				for (local37 = 0; local37 < this.anInt544; local37++) {
					this.anIntArray131[local37] = arg2.anIntArray131[local37];
					this.anIntArray132[local37] = arg2.anIntArray132[local37];
					this.anIntArray133[local37] = arg2.anIntArray133[local37];
				}
				this.anIntArray134 = new int[this.anInt544];
				@Pc(117) int local117;
				if (arg2.anIntArray134 == null) {
					for (local117 = 0; local117 < this.anInt544; local117++) {
						this.anIntArray134[local117] = 0;
					}
				} else {
					for (local117 = 0; local117 < this.anInt544; local117++) {
						this.anIntArray134[local117] = arg2.anIntArray134[local117];
					}
				}
				super.aClass28Array10 = new Class28[this.anInt543];
				for (local117 = 0; local117 < this.anInt543; local117++) {
					@Pc(165) Class28 local165 = super.aClass28Array10[local117] = new Class28();
					@Pc(170) Class28 local170 = arg2.aClass28Array10[local117];
					local165.anInt818 = local170.anInt818;
					local165.anInt819 = local170.anInt819;
					local165.anInt820 = local170.anInt820;
					local165.anInt821 = local170.anInt821;
				}
				this.aClass28Array9 = arg2.aClass28Array9;
			} else {
				this.anIntArray131 = arg2.anIntArray131;
				this.anIntArray132 = arg2.anIntArray132;
				this.anIntArray133 = arg2.anIntArray133;
				this.anIntArray134 = arg2.anIntArray134;
			}
			this.anIntArray125 = arg2.anIntArray125;
			this.anIntArray127 = arg2.anIntArray127;
			this.anIntArray137 = arg2.anIntArray137;
			this.anIntArray136 = arg2.anIntArray136;
			this.anIntArray135 = arg2.anIntArray135;
			this.anInt545 = arg2.anInt545;
			this.anIntArray128 = arg2.anIntArray128;
			this.anIntArray129 = arg2.anIntArray129;
			this.anIntArray130 = arg2.anIntArray130;
			this.anIntArray138 = arg2.anIntArray138;
			this.anIntArray139 = arg2.anIntArray139;
			this.anIntArray140 = arg2.anIntArray140;
			super.anInt566 = arg2.anInt566;
			this.anInt552 = arg2.anInt552;
			this.anInt551 = arg2.anInt551;
			if (arg0 != 9) {
				throw new NullPointerException();
			}
			this.anInt554 = arg2.anInt554;
			this.anInt553 = arg2.anInt553;
			this.anInt547 = arg2.anInt547;
			this.anInt549 = arg2.anInt549;
			this.anInt550 = arg2.anInt550;
			this.anInt548 = arg2.anInt548;
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("42010, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZILclient!fb;)V")
	public void method290(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1_Sub5 arg2) {
		try {
			this.anInt543 = arg2.anInt543;
			this.anInt544 = arg2.anInt544;
			this.anInt546 = arg2.anInt546;
			if (Static11.anIntArray121.length < this.anInt543) {
				Static11.anIntArray121 = new int[this.anInt543 + 100];
				Static11.anIntArray122 = new int[this.anInt543 + 100];
				Static11.anIntArray123 = new int[this.anInt543 + 100];
			}
			this.anIntArray125 = Static11.anIntArray121;
			this.anIntArray126 = Static11.anIntArray122;
			this.anIntArray127 = Static11.anIntArray123;
			for (@Pc(47) int local47 = 0; local47 < this.anInt543; local47++) {
				this.anIntArray125[local47] = arg2.anIntArray125[local47];
				this.anIntArray126[local47] = arg2.anIntArray126[local47];
				this.anIntArray127[local47] = arg2.anIntArray127[local47];
			}
			if (arg0) {
				this.anIntArray136 = arg2.anIntArray136;
			} else {
				if (Static11.anIntArray124.length < this.anInt544) {
					Static11.anIntArray124 = new int[this.anInt544 + 100];
				}
				this.anIntArray136 = Static11.anIntArray124;
				@Pc(105) int local105;
				if (arg2.anIntArray136 == null) {
					for (local105 = 0; local105 < this.anInt544; local105++) {
						this.anIntArray136[local105] = 0;
					}
				} else {
					for (local105 = 0; local105 < this.anInt544; local105++) {
						this.anIntArray136[local105] = arg2.anIntArray136[local105];
					}
				}
			}
			this.anIntArray134 = arg2.anIntArray134;
			this.anIntArray137 = arg2.anIntArray137;
			this.anIntArray135 = arg2.anIntArray135;
			this.anInt545 = arg2.anInt545;
			if (arg1 > 0) {
				this.anIntArrayArray8 = arg2.anIntArrayArray8;
				this.anIntArrayArray7 = arg2.anIntArrayArray7;
				this.anIntArray128 = arg2.anIntArray128;
				this.anIntArray129 = arg2.anIntArray129;
				this.anIntArray130 = arg2.anIntArray130;
				this.anIntArray131 = arg2.anIntArray131;
				this.anIntArray132 = arg2.anIntArray132;
				this.anIntArray133 = arg2.anIntArray133;
				this.anIntArray138 = arg2.anIntArray138;
				this.anIntArray139 = arg2.anIntArray139;
				this.anIntArray140 = arg2.anIntArray140;
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("41990, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!fb;I)I")
	private int method291(@OriginalArg(0) Class1_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = -1;
		@Pc(8) int local8 = arg0.anIntArray125[arg1];
		@Pc(13) int local13 = arg0.anIntArray126[arg1];
		@Pc(18) int local18 = arg0.anIntArray127[arg1];
		for (@Pc(20) int local20 = 0; local20 < this.anInt543; local20++) {
			if (local8 == this.anIntArray125[local20] && local13 == this.anIntArray126[local20] && local18 == this.anIntArray127[local20]) {
				local3 = local20;
				break;
			}
		}
		if (local3 == -1) {
			this.anIntArray125[this.anInt543] = local8;
			this.anIntArray126[this.anInt543] = local13;
			this.anIntArray127[this.anInt543] = local18;
			if (arg0.anIntArray141 != null) {
				this.anIntArray141[this.anInt543] = arg0.anIntArray141[arg1];
			}
			local3 = this.anInt543++;
		}
		return local3;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
	public void method292(@OriginalArg(0) int arg0) {
		try {
			super.anInt566 = 0;
			this.anInt551 = 0;
			this.anInt552 = 0;
			if (arg0 != -15382) {
				this.anInt540 = 115;
			}
			for (@Pc(16) int local16 = 0; local16 < this.anInt543; local16++) {
				@Pc(23) int local23 = this.anIntArray125[local16];
				@Pc(28) int local28 = this.anIntArray126[local16];
				@Pc(33) int local33 = this.anIntArray127[local16];
				if (-local28 > super.anInt566) {
					super.anInt566 = -local28;
				}
				if (local28 > this.anInt552) {
					this.anInt552 = local28;
				}
				@Pc(57) int local57 = local23 * local23 + local33 * local33;
				if (local57 > this.anInt551) {
					this.anInt551 = local57;
				}
			}
			this.anInt551 = (int) (Math.sqrt((double) this.anInt551) + 0.99D);
			this.anInt554 = (int) (Math.sqrt((double) (this.anInt551 * this.anInt551 + super.anInt566 * super.anInt566)) + 0.99D);
			this.anInt553 = this.anInt554 + (int) (Math.sqrt((double) (this.anInt551 * this.anInt551 + this.anInt552 * this.anInt552)) + 0.99D);
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("94084, " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public void method293(@OriginalArg(0) boolean arg0) {
		try {
			super.anInt566 = 0;
			this.anInt552 = 0;
			for (@Pc(7) int local7 = 0; local7 < this.anInt543; local7++) {
				@Pc(14) int local14 = this.anIntArray126[local7];
				if (-local14 > super.anInt566) {
					super.anInt566 = -local14;
				}
				if (local14 > this.anInt552) {
					this.anInt552 = local14;
				}
			}
			if (!arg0) {
				Static11.aBoolean132 = !Static11.aBoolean132;
			}
			this.anInt554 = (int) (Math.sqrt((double) (this.anInt551 * this.anInt551 + super.anInt566 * super.anInt566)) + 0.99D);
			this.anInt553 = this.anInt554 + (int) (Math.sqrt((double) (this.anInt551 * this.anInt551 + this.anInt552 * this.anInt552)) + 0.99D);
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("83718, " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
	private void method294(@OriginalArg(0) int arg0) {
		try {
			super.anInt566 = 0;
			this.anInt551 = 0;
			this.anInt552 = 0;
			this.anInt547 = 999999;
			this.anInt548 = -999999;
			this.anInt549 = -99999;
			this.anInt550 = 99999;
			for (@Pc(22) int local22 = 0; local22 < this.anInt543; local22++) {
				@Pc(29) int local29 = this.anIntArray125[local22];
				@Pc(34) int local34 = this.anIntArray126[local22];
				@Pc(39) int local39 = this.anIntArray127[local22];
				if (local29 < this.anInt547) {
					this.anInt547 = local29;
				}
				if (local29 > this.anInt548) {
					this.anInt548 = local29;
				}
				if (local39 < this.anInt550) {
					this.anInt550 = local39;
				}
				if (local39 > this.anInt549) {
					this.anInt549 = local39;
				}
				if (-local34 > super.anInt566) {
					super.anInt566 = -local34;
				}
				if (local34 > this.anInt552) {
					this.anInt552 = local34;
				}
				@Pc(91) int local91 = local29 * local29 + local39 * local39;
				if (local91 > this.anInt551) {
					this.anInt551 = local91;
				}
			}
			this.anInt551 = (int) Math.sqrt((double) this.anInt551);
			if (arg0 >= 3 && arg0 <= 3) {
				this.anInt554 = (int) Math.sqrt((double) (this.anInt551 * this.anInt551 + super.anInt566 * super.anInt566));
				this.anInt553 = this.anInt554 + (int) Math.sqrt((double) (this.anInt551 * this.anInt551 + this.anInt552 * this.anInt552));
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("97517, " + arg0 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public void method295(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 112) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			@Pc(32) int local32;
			@Pc(19) int local19;
			@Pc(21) int local21;
			@Pc(28) int local28;
			@Pc(73) int local73;
			@Pc(80) int local80;
			@Pc(17) int[] local17;
			if (this.anIntArray141 != null) {
				local17 = new int[256];
				local19 = 0;
				for (local21 = 0; local21 < this.anInt543; local21++) {
					local28 = this.anIntArray141[local21];
					local32 = local17[local28]++;
					if (local28 > local19) {
						local19 = local28;
					}
				}
				this.anIntArrayArray7 = new int[local19 + 1][];
				for (local28 = 0; local28 <= local19; local28++) {
					this.anIntArrayArray7[local28] = new int[local17[local28]];
					local17[local28] = 0;
				}
				local73 = 0;
				while (local73 < this.anInt543) {
					local80 = this.anIntArray141[local73];
					this.anIntArrayArray7[local80][local17[local80]++] = local73++;
				}
				this.anIntArray141 = null;
			}
			if (this.anIntArray142 != null) {
				local17 = new int[256];
				local19 = 0;
				for (local21 = 0; local21 < this.anInt544; local21++) {
					local28 = this.anIntArray142[local21];
					local32 = local17[local28]++;
					if (local28 > local19) {
						local19 = local28;
					}
				}
				this.anIntArrayArray8 = new int[local19 + 1][];
				for (local28 = 0; local28 <= local19; local28++) {
					this.anIntArrayArray8[local28] = new int[local17[local28]];
					local17[local28] = 0;
				}
				local73 = 0;
				while (local73 < this.anInt544) {
					local80 = this.anIntArray142[local73];
					this.anIntArrayArray8[local80][local17[local80]++] = local73++;
				}
				this.anIntArray142 = null;
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("81292, " + arg0 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(ZI)V")
	public void method296(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anIntArrayArray7 != null && arg1 != -1) {
				@Pc(11) Class14 local11 = Static13.method327(0, arg1);
				if (local11 != null) {
					@Pc(17) Class12 local17 = local11.aClass12_1;
					Static11.anInt556 = 0;
					if (!arg0) {
						Static11.anInt541 = 352;
					}
					Static11.anInt557 = 0;
					Static11.anInt558 = 0;
					for (@Pc(29) int local29 = 0; local29 < local11.anInt594; local29++) {
						@Pc(36) int local36 = local11.anIntArray170[local29];
						this.method298(local17.anIntArray164[local36], local17.anIntArrayArray11[local36], local11.anIntArray171[local29], local11.anIntArray172[local29], local11.anIntArray173[local29]);
					}
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("88435, " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([IIII)V")
	public void method297(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 != -1) {
				if (arg0 == null || arg3 == -1) {
					this.method296(true, arg2);
				} else {
					@Pc(19) Class14 local19 = Static13.method327(0, arg2);
					if (arg1 < 0 && local19 != null) {
						@Pc(29) Class14 local29 = Static13.method327(0, arg3);
						if (local29 == null) {
							this.method296(true, arg2);
						} else {
							@Pc(39) Class12 local39 = local19.aClass12_1;
							Static11.anInt556 = 0;
							Static11.anInt557 = 0;
							Static11.anInt558 = 0;
							@Pc(47) byte local47 = 0;
							@Pc(50) int local50 = local47 + 1;
							@Pc(52) int local52 = arg0[local47];
							@Pc(61) int local61;
							for (@Pc(54) int local54 = 0; local54 < local19.anInt594; local54++) {
								local61 = local19.anIntArray170[local54];
								while (local61 > local52) {
									local52 = arg0[local50++];
								}
								if (local61 != local52 || local39.anIntArray164[local61] == 0) {
									this.method298(local39.anIntArray164[local61], local39.anIntArrayArray11[local61], local19.anIntArray171[local54], local19.anIntArray172[local54], local19.anIntArray173[local54]);
								}
							}
							Static11.anInt556 = 0;
							Static11.anInt557 = 0;
							Static11.anInt558 = 0;
							local47 = 0;
							local50 = local47 + 1;
							local52 = arg0[local47];
							for (local61 = 0; local61 < local29.anInt594; local61++) {
								@Pc(128) int local128 = local29.anIntArray170[local61];
								while (local128 > local52) {
									local52 = arg0[local50++];
								}
								if (local128 == local52 || local39.anIntArray164[local128] == 0) {
									this.method298(local39.anIntArray164[local128], local39.anIntArrayArray11[local128], local29.anIntArray171[local61], local29.anIntArray172[local61], local29.anIntArray173[local61]);
								}
							}
						}
					}
				}
			}
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("41500, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[IIII)V")
	private void method298(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = arg1.length;
		@Pc(8) int local8;
		@Pc(16) int local16;
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (arg0 == 0) {
			local8 = 0;
			Static11.anInt556 = 0;
			Static11.anInt557 = 0;
			Static11.anInt558 = 0;
			for (local16 = 0; local16 < local4; local16++) {
				@Pc(22) int local22 = arg1[local16];
				if (local22 < this.anIntArrayArray7.length) {
					@Pc(32) int[] local32 = this.anIntArrayArray7[local22];
					for (local34 = 0; local34 < local32.length; local34++) {
						local40 = local32[local34];
						Static11.anInt556 += this.anIntArray125[local40];
						Static11.anInt557 += this.anIntArray126[local40];
						Static11.anInt558 += this.anIntArray127[local40];
						local8++;
					}
				}
			}
			if (local8 > 0) {
				Static11.anInt556 = Static11.anInt556 / local8 + arg2;
				Static11.anInt557 = Static11.anInt557 / local8 + arg3;
				Static11.anInt558 = Static11.anInt558 / local8 + arg4;
			} else {
				Static11.anInt556 = arg2;
				Static11.anInt557 = arg3;
				Static11.anInt558 = arg4;
			}
			return;
		}
		@Pc(120) int[] local120;
		@Pc(122) int local122;
		if (arg0 == 1) {
			for (local8 = 0; local8 < local4; local8++) {
				local16 = arg1[local8];
				if (local16 < this.anIntArrayArray7.length) {
					local120 = this.anIntArrayArray7[local16];
					for (local122 = 0; local122 < local120.length; local122++) {
						local34 = local120[local122];
						this.anIntArray125[local34] += arg2;
						this.anIntArray126[local34] += arg3;
						this.anIntArray127[local34] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local8 = 0; local8 < local4; local8++) {
				local16 = arg1[local8];
				if (local16 < this.anIntArrayArray7.length) {
					local120 = this.anIntArrayArray7[local16];
					for (local122 = 0; local122 < local120.length; local122++) {
						local34 = local120[local122];
						this.anIntArray125[local34] -= Static11.anInt556;
						this.anIntArray126[local34] -= Static11.anInt557;
						this.anIntArray127[local34] -= Static11.anInt558;
						local40 = (arg2 & 0xFF) * 8;
						@Pc(227) int local227 = (arg3 & 0xFF) * 8;
						@Pc(233) int local233 = (arg4 & 0xFF) * 8;
						@Pc(239) int local239;
						@Pc(243) int local243;
						@Pc(259) int local259;
						if (local233 != 0) {
							local239 = Static11.anIntArray158[local233];
							local243 = Static11.anIntArray159[local233];
							local259 = this.anIntArray126[local34] * local239 + this.anIntArray125[local34] * local243 >> 16;
							this.anIntArray126[local34] = this.anIntArray126[local34] * local243 - this.anIntArray125[local34] * local239 >> 16;
							this.anIntArray125[local34] = local259;
						}
						if (local40 != 0) {
							local239 = Static11.anIntArray158[local40];
							local243 = Static11.anIntArray159[local40];
							local259 = this.anIntArray126[local34] * local243 - this.anIntArray127[local34] * local239 >> 16;
							this.anIntArray127[local34] = this.anIntArray126[local34] * local239 + this.anIntArray127[local34] * local243 >> 16;
							this.anIntArray126[local34] = local259;
						}
						if (local227 != 0) {
							local239 = Static11.anIntArray158[local227];
							local243 = Static11.anIntArray159[local227];
							local259 = this.anIntArray127[local34] * local239 + this.anIntArray125[local34] * local243 >> 16;
							this.anIntArray127[local34] = this.anIntArray127[local34] * local243 - this.anIntArray125[local34] * local239 >> 16;
							this.anIntArray125[local34] = local259;
						}
						this.anIntArray125[local34] += Static11.anInt556;
						this.anIntArray126[local34] += Static11.anInt557;
						this.anIntArray127[local34] += Static11.anInt558;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local8 = 0; local8 < local4; local8++) {
				local16 = arg1[local8];
				if (local16 < this.anIntArrayArray7.length) {
					local120 = this.anIntArrayArray7[local16];
					for (local122 = 0; local122 < local120.length; local122++) {
						local34 = local120[local122];
						this.anIntArray125[local34] -= Static11.anInt556;
						this.anIntArray126[local34] -= Static11.anInt557;
						this.anIntArray127[local34] -= Static11.anInt558;
						this.anIntArray125[local34] = this.anIntArray125[local34] * arg2 / 128;
						this.anIntArray126[local34] = this.anIntArray126[local34] * arg3 / 128;
						this.anIntArray127[local34] = this.anIntArray127[local34] * arg4 / 128;
						this.anIntArray125[local34] += Static11.anInt556;
						this.anIntArray126[local34] += Static11.anInt557;
						this.anIntArray127[local34] += Static11.anInt558;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray8 != null && this.anIntArray136 != null)) {
			for (local8 = 0; local8 < local4; local8++) {
				local16 = arg1[local8];
				if (local16 < this.anIntArrayArray8.length) {
					local120 = this.anIntArrayArray8[local16];
					for (local122 = 0; local122 < local120.length; local122++) {
						local34 = local120[local122];
						this.anIntArray136[local34] += arg2 * 8;
						if (this.anIntArray136[local34] < 0) {
							this.anIntArray136[local34] = 0;
						}
						if (this.anIntArray136[local34] > 255) {
							this.anIntArray136[local34] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public void method299(@OriginalArg(0) byte arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt543; local1++) {
				@Pc(8) int local8 = this.anIntArray125[local1];
				this.anIntArray125[local1] = this.anIntArray127[local1];
				this.anIntArray127[local1] = -local8;
			}
			if (arg0 == 8) {
				@Pc(32) boolean local32 = false;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("12325, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V")
	public void method300(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 24) {
				this.aBoolean131 = !this.aBoolean131;
			}
			@Pc(14) int local14 = Static11.anIntArray158[arg1];
			@Pc(18) int local18 = Static11.anIntArray159[arg1];
			for (@Pc(20) int local20 = 0; local20 < this.anInt543; local20++) {
				@Pc(38) int local38 = this.anIntArray126[local20] * local18 - this.anIntArray127[local20] * local14 >> 16;
				this.anIntArray127[local20] = this.anIntArray126[local20] * local14 + this.anIntArray127[local20] * local18 >> 16;
				this.anIntArray126[local20] = local38;
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("5891, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BIII)V")
	public void method301(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anInt543; local3++) {
				this.anIntArray125[local3] += arg1;
				this.anIntArray126[local3] += arg3;
				this.anIntArray127[local3] += arg2;
			}
			if (arg0 != -32) {
				for (@Pc(39) int local39 = 1; local39 > 0; local39++) {
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("50154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
	public void method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt544; local1++) {
			if (this.anIntArray137[local1] == arg0) {
				this.anIntArray137[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
	public void method303(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 15) {
				this.anInt540 = -16;
			}
			for (@Pc(9) int local9 = 0; local9 < this.anInt543; local9++) {
				this.anIntArray127[local9] = -this.anIntArray127[local9];
			}
			for (@Pc(27) int local27 = 0; local27 < this.anInt544; local27++) {
				@Pc(34) int local34 = this.anIntArray128[local27];
				this.anIntArray128[local27] = this.anIntArray130[local27];
				this.anIntArray130[local27] = local34;
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("35827, " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V")
	public void method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anInt543; local1++) {
				this.anIntArray125[local1] = this.anIntArray125[local1] * arg2 / 128;
				this.anIntArray126[local1] = this.anIntArray126[local1] * arg3 / 128;
				this.anIntArray127[local1] = this.anIntArray127[local1] * arg1 / 128;
			}
			@Pc(48) int local48 = 61 / arg0;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("57395, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIZ)V")
	public void method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		if (this.anIntArray131 == null) {
			this.anIntArray131 = new int[this.anInt544];
			this.anIntArray132 = new int[this.anInt544];
			this.anIntArray133 = new int[this.anInt544];
		}
		@Pc(50) int local50;
		if (super.aClass28Array10 == null) {
			super.aClass28Array10 = new Class28[this.anInt543];
			for (local50 = 0; local50 < this.anInt543; local50++) {
				super.aClass28Array10[local50] = new Class28();
			}
		}
		@Pc(73) int local73;
		for (local50 = 0; local50 < this.anInt544; local50++) {
			local73 = this.anIntArray128[local50];
			@Pc(78) int local78 = this.anIntArray129[local50];
			@Pc(83) int local83 = this.anIntArray130[local50];
			@Pc(93) int local93 = this.anIntArray125[local78] - this.anIntArray125[local73];
			@Pc(103) int local103 = this.anIntArray126[local78] - this.anIntArray126[local73];
			@Pc(113) int local113 = this.anIntArray127[local78] - this.anIntArray127[local73];
			@Pc(123) int local123 = this.anIntArray125[local83] - this.anIntArray125[local73];
			@Pc(133) int local133 = this.anIntArray126[local83] - this.anIntArray126[local73];
			@Pc(143) int local143 = this.anIntArray127[local83] - this.anIntArray127[local73];
			@Pc(151) int local151 = local103 * local143 - local133 * local113;
			@Pc(159) int local159 = local113 * local123 - local143 * local93;
			@Pc(167) int local167;
			for (local167 = local93 * local133 - local123 * local103; local151 > 8192 || local159 > 8192 || local167 > 8192 || local151 < -8192 || local159 < -8192 || local167 < -8192; local167 >>= 0x1) {
				local151 >>= 0x1;
				local159 >>= 0x1;
			}
			@Pc(214) int local214 = (int) Math.sqrt((double) (local151 * local151 + local159 * local159 + local167 * local167));
			if (local214 <= 0) {
				local214 = 1;
			}
			local151 = local151 * 256 / local214;
			local159 = local159 * 256 / local214;
			local167 = local167 * 256 / local214;
			if (this.anIntArray134 == null || (this.anIntArray134[local50] & 0x1) == 0) {
				@Pc(251) Class28 local251 = super.aClass28Array10[local73];
				local251.anInt818 += local151;
				local251.anInt819 += local159;
				local251.anInt820 += local167;
				local251.anInt821++;
				@Pc(280) Class28 local280 = super.aClass28Array10[local78];
				local280.anInt818 += local151;
				local280.anInt819 += local159;
				local280.anInt820 += local167;
				local280.anInt821++;
				@Pc(309) Class28 local309 = super.aClass28Array10[local83];
				local309.anInt818 += local151;
				local309.anInt819 += local159;
				local309.anInt820 += local167;
				local309.anInt821++;
			} else {
				@Pc(355) int local355 = arg0 + (arg2 * local151 + arg3 * local159 + arg4 * local167) / (local22 + local22 / 2);
				this.anIntArray131[local50] = Static11.method307(this.anIntArray137[local50], local355, this.anIntArray134[local50]);
			}
		}
		if (arg5) {
			this.method306(arg0, local22, arg2, arg3, arg4);
		} else {
			this.aClass28Array9 = new Class28[this.anInt543];
			for (local73 = 0; local73 < this.anInt543; local73++) {
				@Pc(399) Class28 local399 = super.aClass28Array10[local73];
				@Pc(408) Class28 local408 = this.aClass28Array9[local73] = new Class28();
				local408.anInt818 = local399.anInt818;
				local408.anInt819 = local399.anInt819;
				local408.anInt820 = local399.anInt820;
				local408.anInt821 = local399.anInt821;
			}
		}
		if (arg5) {
			this.method292(-15382);
		} else {
			this.method294(3);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10;
		for (@Pc(3) int local3 = 0; local3 < this.anInt544; local3++) {
			local10 = this.anIntArray128[local3];
			@Pc(15) int local15 = this.anIntArray129[local3];
			@Pc(20) int local20 = this.anIntArray130[local3];
			@Pc(33) Class28 local33;
			@Pc(55) int local55;
			@Pc(28) int local28;
			if (this.anIntArray134 == null) {
				local28 = this.anIntArray137[local3];
				local33 = super.aClass28Array10[local10];
				local55 = arg0 + (arg2 * local33.anInt818 + arg3 * local33.anInt819 + arg4 * local33.anInt820) / (arg1 * local33.anInt821);
				this.anIntArray131[local3] = Static11.method307(local28, local55, 0);
				@Pc(68) Class28 local68 = super.aClass28Array10[local15];
				@Pc(90) int local90 = arg0 + (arg2 * local68.anInt818 + arg3 * local68.anInt819 + arg4 * local68.anInt820) / (arg1 * local68.anInt821);
				this.anIntArray132[local3] = Static11.method307(local28, local90, 0);
				@Pc(103) Class28 local103 = super.aClass28Array10[local20];
				@Pc(125) int local125 = arg0 + (arg2 * local103.anInt818 + arg3 * local103.anInt819 + arg4 * local103.anInt820) / (arg1 * local103.anInt821);
				this.anIntArray133[local3] = Static11.method307(local28, local125, 0);
			} else if ((this.anIntArray134[local3] & 0x1) == 0) {
				local28 = this.anIntArray137[local3];
				@Pc(152) int local152 = this.anIntArray134[local3];
				local33 = super.aClass28Array10[local10];
				local55 = arg0 + (arg2 * local33.anInt818 + arg3 * local33.anInt819 + arg4 * local33.anInt820) / (arg1 * local33.anInt821);
				this.anIntArray131[local3] = Static11.method307(local28, local55, local152);
				local33 = super.aClass28Array10[local15];
				local55 = arg0 + (arg2 * local33.anInt818 + arg3 * local33.anInt819 + arg4 * local33.anInt820) / (arg1 * local33.anInt821);
				this.anIntArray132[local3] = Static11.method307(local28, local55, local152);
				local33 = super.aClass28Array10[local20];
				local55 = arg0 + (arg2 * local33.anInt818 + arg3 * local33.anInt819 + arg4 * local33.anInt820) / (arg1 * local33.anInt821);
				this.anIntArray133[local3] = Static11.method307(local28, local55, local152);
			}
		}
		super.aClass28Array10 = null;
		this.aClass28Array9 = null;
		this.anIntArray141 = null;
		this.anIntArray142 = null;
		if (this.anIntArray134 != null) {
			for (local10 = 0; local10 < this.anInt544; local10++) {
				if ((this.anIntArray134[local10] & 0x2) == 2) {
					return;
				}
			}
		}
		this.anIntArray137 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)V")
	public void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) int local1 = Static16.anInt661;
		@Pc(3) int local3 = Static16.anInt662;
		@Pc(7) int local7 = Static11.anIntArray158[arg0];
		@Pc(11) int local11 = Static11.anIntArray159[arg0];
		@Pc(15) int local15 = Static11.anIntArray158[arg1];
		@Pc(19) int local19 = Static11.anIntArray159[arg1];
		@Pc(23) int local23 = Static11.anIntArray158[arg2];
		@Pc(27) int local27 = Static11.anIntArray159[arg2];
		@Pc(31) int local31 = Static11.anIntArray158[arg3];
		@Pc(35) int local35 = Static11.anIntArray159[arg3];
		@Pc(45) int local45 = arg5 * local31 + arg6 * local35 >> 16;
		for (@Pc(47) int local47 = 0; local47 < this.anInt543; local47++) {
			@Pc(54) int local54 = this.anIntArray125[local47];
			@Pc(59) int local59 = this.anIntArray126[local47];
			@Pc(64) int local64 = this.anIntArray127[local47];
			@Pc(76) int local76;
			if (arg2 != 0) {
				local76 = local59 * local23 + local54 * local27 >> 16;
				local59 = local59 * local27 - local54 * local23 >> 16;
				local54 = local76;
			}
			if (arg0 != 0) {
				local76 = local59 * local11 - local64 * local7 >> 16;
				local64 = local59 * local7 + local64 * local11 >> 16;
				local59 = local76;
			}
			if (arg1 != 0) {
				local76 = local64 * local15 + local54 * local19 >> 16;
				local64 = local64 * local19 - local54 * local15 >> 16;
				local54 = local76;
			}
			local54 += arg4;
			local59 += arg5;
			local64 += arg6;
			local76 = local59 * local35 - local64 * local31 >> 16;
			local64 = local59 * local31 + local64 * local35 >> 16;
			Static11.anIntArray145[local47] = local64 - local45;
			Static11.anIntArray143[local47] = local1 + (local54 << 9) / local64;
			Static11.anIntArray144[local47] = local3 + (local76 << 9) / local64;
			if (this.anInt546 > 0) {
				Static11.anIntArray146[local47] = local54;
				Static11.anIntArray147[local47] = local76;
				Static11.anIntArray148[local47] = local64;
			}
		}
		try {
			this.method309(false, false, 0);
		} catch (@Pc(223) Exception local223) {
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(11) int local11 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(21) int local21 = arg6 * arg1 + local11 * arg2 >> 16;
		@Pc(28) int local28 = this.anInt551 * arg2 >> 16;
		@Pc(32) int local32 = local21 + local28;
		if (local32 <= 50 || local21 >= 3500) {
			return;
		}
		@Pc(49) int local49 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(56) int local56 = local49 - this.anInt551 << 9;
		if (local56 / local32 >= Static14.anInt745) {
			return;
		}
		@Pc(69) int local69 = local49 + this.anInt551 << 9;
		if (local69 / local32 <= -Static14.anInt745) {
			return;
		}
		@Pc(86) int local86 = arg6 * arg2 - local11 * arg1 >> 16;
		@Pc(93) int local93 = this.anInt551 * arg1 >> 16;
		@Pc(99) int local99 = local86 + local93 << 9;
		if (local99 / local32 <= -Static14.anInt746) {
			return;
		}
		@Pc(115) int local115 = local93 + (super.anInt566 * arg2 >> 16);
		@Pc(121) int local121 = local86 - local115 << 9;
		if (local121 / local32 >= Static14.anInt746) {
			return;
		}
		@Pc(136) int local136 = local28 + (super.anInt566 * arg1 >> 16);
		@Pc(138) boolean local138 = false;
		if (local21 - local136 <= 50) {
			local138 = true;
		}
		@Pc(147) boolean local147 = false;
		@Pc(155) int local155;
		@Pc(204) int local204;
		@Pc(208) int local208;
		if (arg8 > 0 && Static11.aBoolean134) {
			local155 = local21 - local28;
			if (local155 <= 50) {
				local155 = 50;
			}
			if (local49 > 0) {
				local56 /= local32;
				local69 /= local155;
			} else {
				local69 /= local32;
				local56 /= local155;
			}
			if (local86 > 0) {
				local121 /= local32;
				local99 /= local155;
			} else {
				local99 /= local32;
				local121 /= local155;
			}
			local204 = Static11.anInt559 - Static16.anInt661;
			local208 = Static11.anInt560 - Static16.anInt662;
			if (local204 > local56 && local204 < local69 && local208 > local121 && local208 < local99) {
				if (this.aBoolean133) {
					Static11.anIntArray157[Static11.anInt561++] = arg8;
				} else {
					local147 = true;
				}
			}
		}
		local155 = Static16.anInt661;
		local204 = Static16.anInt662;
		local208 = 0;
		@Pc(243) int local243 = 0;
		if (arg0 != 0) {
			local208 = Static11.anIntArray158[arg0];
			local243 = Static11.anIntArray159[arg0];
		}
		for (@Pc(255) int local255 = 0; local255 < this.anInt543; local255++) {
			@Pc(262) int local262 = this.anIntArray125[local255];
			@Pc(267) int local267 = this.anIntArray126[local255];
			@Pc(272) int local272 = this.anIntArray127[local255];
			@Pc(284) int local284;
			if (arg0 != 0) {
				local284 = local272 * local208 + local262 * local243 >> 16;
				local272 = local272 * local243 - local262 * local208 >> 16;
				local262 = local284;
			}
			local262 += arg5;
			local267 += arg6;
			local272 += arg7;
			local284 = local272 * arg3 + local262 * arg4 >> 16;
			local272 = local272 * arg4 - local262 * arg3 >> 16;
			local262 = local284;
			local284 = local267 * arg2 - local272 * arg1 >> 16;
			local272 = local267 * arg1 + local272 * arg2 >> 16;
			Static11.anIntArray145[local255] = local272 - local21;
			if (local272 >= 50) {
				Static11.anIntArray143[local255] = local155 + (local262 << 9) / local272;
				Static11.anIntArray144[local255] = local204 + (local284 << 9) / local272;
			} else {
				Static11.anIntArray143[local255] = -5000;
				local138 = true;
			}
			if (local138 || this.anInt546 > 0) {
				Static11.anIntArray146[local255] = local262;
				Static11.anIntArray147[local255] = local284;
				Static11.anIntArray148[local255] = local272;
			}
		}
		try {
			this.method309(local138, local147, arg8);
		} catch (@Pc(418) Exception local418) {
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZI)V")
	private void method309(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt553; local3++) {
			Static11.anIntArray149[local3] = 0;
		}
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(86) int local86;
		for (@Pc(16) int local16 = 0; local16 < this.anInt544; local16++) {
			if (this.anIntArray134 == null || this.anIntArray134[local16] != -1) {
				local32 = this.anIntArray128[local16];
				local37 = this.anIntArray129[local16];
				local42 = this.anIntArray130[local16];
				local46 = Static11.anIntArray143[local32];
				local50 = Static11.anIntArray143[local37];
				local54 = Static11.anIntArray143[local42];
				if (arg0 && (local46 == -5000 || local50 == -5000 || local54 == -5000)) {
					Static11.aBooleanArray7[local16] = true;
					local86 = (Static11.anIntArray145[local32] + Static11.anIntArray145[local37] + Static11.anIntArray145[local42]) / 3 + this.anInt554;
					Static11.anIntArrayArray9[local86][Static11.anIntArray149[local86]++] = local16;
				} else {
					if (arg1 && this.method312(Static11.anInt559, Static11.anInt560, Static11.anIntArray144[local32], Static11.anIntArray144[local37], Static11.anIntArray144[local42], local46, local50, local54)) {
						Static11.anIntArray157[Static11.anInt561++] = arg2;
						arg1 = false;
					}
					if ((local46 - local50) * (Static11.anIntArray144[local42] - Static11.anIntArray144[local37]) - (Static11.anIntArray144[local32] - Static11.anIntArray144[local37]) * (local54 - local50) > 0) {
						Static11.aBooleanArray7[local16] = false;
						if (local46 >= 0 && local50 >= 0 && local54 >= 0 && local46 <= Static14.anInt744 && local50 <= Static14.anInt744 && local54 <= Static14.anInt744) {
							Static11.aBooleanArray6[local16] = false;
						} else {
							Static11.aBooleanArray6[local16] = true;
						}
						local86 = (Static11.anIntArray145[local32] + Static11.anIntArray145[local37] + Static11.anIntArray145[local42]) / 3 + this.anInt554;
						Static11.anIntArrayArray9[local86][Static11.anIntArray149[local86]++] = local16;
					}
				}
			}
		}
		if (this.anIntArray135 == null) {
			for (local32 = this.anInt553 - 1; local32 >= 0; local32--) {
				local37 = Static11.anIntArray149[local32];
				if (local37 > 0) {
					@Pc(238) int[] local238 = Static11.anIntArrayArray9[local32];
					for (local46 = 0; local46 < local37; local46++) {
						this.method310(local238[local46]);
					}
				}
			}
			return;
		}
		for (local32 = 0; local32 < 12; local32++) {
			Static11.anIntArray150[local32] = 0;
			Static11.anIntArray153[local32] = 0;
		}
		@Pc(310) int local310;
		for (local37 = this.anInt553 - 1; local37 >= 0; local37--) {
			local42 = Static11.anIntArray149[local37];
			if (local42 > 0) {
				@Pc(288) int[] local288 = Static11.anIntArrayArray9[local37];
				for (local50 = 0; local50 < local42; local50++) {
					local54 = local288[local50];
					local86 = this.anIntArray135[local54];
					local310 = Static11.anIntArray150[local86]++;
					Static11.anIntArrayArray10[local86][local310] = local54;
					if (local86 < 10) {
						Static11.anIntArray153[local86] += local37;
					} else if (local86 == 10) {
						Static11.anIntArray151[local310] = local37;
					} else {
						Static11.anIntArray152[local310] = local37;
					}
				}
			}
		}
		local42 = 0;
		if (Static11.anIntArray150[1] > 0 || Static11.anIntArray150[2] > 0) {
			local42 = (Static11.anIntArray153[1] + Static11.anIntArray153[2]) / (Static11.anIntArray150[1] + Static11.anIntArray150[2]);
		}
		local46 = 0;
		if (Static11.anIntArray150[3] > 0 || Static11.anIntArray150[4] > 0) {
			local46 = (Static11.anIntArray153[3] + Static11.anIntArray153[4]) / (Static11.anIntArray150[3] + Static11.anIntArray150[4]);
		}
		local50 = 0;
		if (Static11.anIntArray150[6] > 0 || Static11.anIntArray150[8] > 0) {
			local50 = (Static11.anIntArray153[6] + Static11.anIntArray153[8]) / (Static11.anIntArray150[6] + Static11.anIntArray150[8]);
		}
		local86 = 0;
		local310 = Static11.anIntArray150[10];
		@Pc(436) int[] local436 = Static11.anIntArrayArray10[10];
		@Pc(438) int[] local438 = Static11.anIntArray151;
		if (local86 == local310) {
			local86 = 0;
			local310 = Static11.anIntArray150[11];
			local436 = Static11.anIntArrayArray10[11];
			local438 = Static11.anIntArray152;
		}
		if (local86 < local310) {
			local54 = local438[local86];
		} else {
			local54 = -1000;
		}
		for (@Pc(466) int local466 = 0; local466 < 10; local466++) {
			while (local466 == 0 && local54 > local42) {
				this.method310(local436[local86++]);
				if (local86 == local310 && local436 != Static11.anIntArrayArray10[11]) {
					local86 = 0;
					local310 = Static11.anIntArray150[11];
					local436 = Static11.anIntArrayArray10[11];
					local438 = Static11.anIntArray152;
				}
				if (local86 < local310) {
					local54 = local438[local86];
				} else {
					local54 = -1000;
				}
			}
			while (local466 == 3 && local54 > local46) {
				this.method310(local436[local86++]);
				if (local86 == local310 && local436 != Static11.anIntArrayArray10[11]) {
					local86 = 0;
					local310 = Static11.anIntArray150[11];
					local436 = Static11.anIntArrayArray10[11];
					local438 = Static11.anIntArray152;
				}
				if (local86 < local310) {
					local54 = local438[local86];
				} else {
					local54 = -1000;
				}
			}
			while (local466 == 5 && local54 > local50) {
				this.method310(local436[local86++]);
				if (local86 == local310 && local436 != Static11.anIntArrayArray10[11]) {
					local86 = 0;
					local310 = Static11.anIntArray150[11];
					local436 = Static11.anIntArrayArray10[11];
					local438 = Static11.anIntArray152;
				}
				if (local86 < local310) {
					local54 = local438[local86];
				} else {
					local54 = -1000;
				}
			}
			@Pc(604) int local604 = Static11.anIntArray150[local466];
			@Pc(608) int[] local608 = Static11.anIntArrayArray10[local466];
			for (@Pc(610) int local610 = 0; local610 < local604; local610++) {
				this.method310(local608[local610]);
			}
		}
		while (local54 != -1000) {
			this.method310(local436[local86++]);
			if (local86 == local310 && local436 != Static11.anIntArrayArray10[11]) {
				local86 = 0;
				local436 = Static11.anIntArrayArray10[11];
				local310 = Static11.anIntArray150[11];
				local438 = Static11.anIntArray152;
			}
			if (local86 < local310) {
				local54 = local438[local86];
			} else {
				local54 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
	private void method310(@OriginalArg(0) int arg0) {
		if (Static11.aBooleanArray7[arg0]) {
			this.method311(arg0);
			return;
		}
		@Pc(14) int local14 = this.anIntArray128[arg0];
		@Pc(19) int local19 = this.anIntArray129[arg0];
		@Pc(24) int local24 = this.anIntArray130[arg0];
		Static16.aBoolean159 = Static11.aBooleanArray6[arg0];
		if (this.anIntArray136 == null) {
			Static16.anInt660 = 0;
		} else {
			Static16.anInt660 = this.anIntArray136[arg0];
		}
		@Pc(45) int local45;
		if (this.anIntArray134 == null) {
			local45 = 0;
		} else {
			local45 = this.anIntArray134[arg0] & 0x3;
		}
		if (local45 == 0) {
			Static16.method381(Static11.anIntArray144[local14], Static11.anIntArray144[local19], Static11.anIntArray144[local24], Static11.anIntArray143[local14], Static11.anIntArray143[local19], Static11.anIntArray143[local24], this.anIntArray131[arg0], this.anIntArray132[arg0], this.anIntArray133[arg0]);
		} else if (local45 == 1) {
			Static16.method383(Static11.anIntArray144[local14], Static11.anIntArray144[local19], Static11.anIntArray144[local24], Static11.anIntArray143[local14], Static11.anIntArray143[local19], Static11.anIntArray143[local24], Static11.anIntArray160[this.anIntArray131[arg0]]);
		} else {
			@Pc(127) int local127;
			@Pc(132) int local132;
			@Pc(137) int local137;
			@Pc(142) int local142;
			if (local45 == 2) {
				local127 = this.anIntArray134[arg0] >> 2;
				local132 = this.anIntArray138[local127];
				local137 = this.anIntArray139[local127];
				local142 = this.anIntArray140[local127];
				Static16.method385(Static11.anIntArray144[local14], Static11.anIntArray144[local19], Static11.anIntArray144[local24], Static11.anIntArray143[local14], Static11.anIntArray143[local19], Static11.anIntArray143[local24], this.anIntArray131[arg0], this.anIntArray132[arg0], this.anIntArray133[arg0], Static11.anIntArray146[local132], Static11.anIntArray146[local137], Static11.anIntArray146[local142], Static11.anIntArray147[local132], Static11.anIntArray147[local137], Static11.anIntArray147[local142], Static11.anIntArray148[local132], Static11.anIntArray148[local137], Static11.anIntArray148[local142], this.anIntArray137[arg0]);
			} else if (local45 == 3) {
				local127 = this.anIntArray134[arg0] >> 2;
				local132 = this.anIntArray138[local127];
				local137 = this.anIntArray139[local127];
				local142 = this.anIntArray140[local127];
				Static16.method385(Static11.anIntArray144[local14], Static11.anIntArray144[local19], Static11.anIntArray144[local24], Static11.anIntArray143[local14], Static11.anIntArray143[local19], Static11.anIntArray143[local24], this.anIntArray131[arg0], this.anIntArray131[arg0], this.anIntArray131[arg0], Static11.anIntArray146[local132], Static11.anIntArray146[local137], Static11.anIntArray146[local142], Static11.anIntArray147[local132], Static11.anIntArray147[local137], Static11.anIntArray147[local142], Static11.anIntArray148[local132], Static11.anIntArray148[local137], Static11.anIntArray148[local142], this.anIntArray137[arg0]);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
	private void method311(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static16.anInt661;
		@Pc(5) int local5 = Static16.anInt662;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray128[arg0];
		@Pc(17) int local17 = this.anIntArray129[arg0];
		@Pc(22) int local22 = this.anIntArray130[arg0];
		@Pc(26) int local26 = Static11.anIntArray148[local12];
		@Pc(30) int local30 = Static11.anIntArray148[local17];
		@Pc(34) int local34 = Static11.anIntArray148[local22];
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(85) int local85;
		if (local26 >= 50) {
			Static11.anIntArray154[local7] = Static11.anIntArray143[local12];
			Static11.anIntArray155[local7] = Static11.anIntArray144[local12];
			Static11.anIntArray156[local7++] = this.anIntArray131[arg0];
		} else {
			local63 = Static11.anIntArray146[local12];
			local67 = Static11.anIntArray147[local12];
			local72 = this.anIntArray131[arg0];
			if (local34 >= 50) {
				local85 = (50 - local26) * Static11.anIntArray161[local34 - local26];
				Static11.anIntArray154[local7] = local3 + (local63 + ((Static11.anIntArray146[local22] - local63) * local85 >> 16) << 9) / 50;
				Static11.anIntArray155[local7] = local5 + (local67 + ((Static11.anIntArray147[local22] - local67) * local85 >> 16) << 9) / 50;
				Static11.anIntArray156[local7++] = local72 + ((this.anIntArray133[arg0] - local72) * local85 >> 16);
			}
			if (local30 >= 50) {
				local85 = (50 - local26) * Static11.anIntArray161[local30 - local26];
				Static11.anIntArray154[local7] = local3 + (local63 + ((Static11.anIntArray146[local17] - local63) * local85 >> 16) << 9) / 50;
				Static11.anIntArray155[local7] = local5 + (local67 + ((Static11.anIntArray147[local17] - local67) * local85 >> 16) << 9) / 50;
				Static11.anIntArray156[local7++] = local72 + ((this.anIntArray132[arg0] - local72) * local85 >> 16);
			}
		}
		if (local30 >= 50) {
			Static11.anIntArray154[local7] = Static11.anIntArray143[local17];
			Static11.anIntArray155[local7] = Static11.anIntArray144[local17];
			Static11.anIntArray156[local7++] = this.anIntArray132[arg0];
		} else {
			local63 = Static11.anIntArray146[local17];
			local67 = Static11.anIntArray147[local17];
			local72 = this.anIntArray132[arg0];
			if (local26 >= 50) {
				local85 = (50 - local30) * Static11.anIntArray161[local26 - local30];
				Static11.anIntArray154[local7] = local3 + (local63 + ((Static11.anIntArray146[local12] - local63) * local85 >> 16) << 9) / 50;
				Static11.anIntArray155[local7] = local5 + (local67 + ((Static11.anIntArray147[local12] - local67) * local85 >> 16) << 9) / 50;
				Static11.anIntArray156[local7++] = local72 + ((this.anIntArray131[arg0] - local72) * local85 >> 16);
			}
			if (local34 >= 50) {
				local85 = (50 - local30) * Static11.anIntArray161[local34 - local30];
				Static11.anIntArray154[local7] = local3 + (local63 + ((Static11.anIntArray146[local22] - local63) * local85 >> 16) << 9) / 50;
				Static11.anIntArray155[local7] = local5 + (local67 + ((Static11.anIntArray147[local22] - local67) * local85 >> 16) << 9) / 50;
				Static11.anIntArray156[local7++] = local72 + ((this.anIntArray133[arg0] - local72) * local85 >> 16);
			}
		}
		if (local34 >= 50) {
			Static11.anIntArray154[local7] = Static11.anIntArray143[local22];
			Static11.anIntArray155[local7] = Static11.anIntArray144[local22];
			Static11.anIntArray156[local7++] = this.anIntArray133[arg0];
		} else {
			local63 = Static11.anIntArray146[local22];
			local67 = Static11.anIntArray147[local22];
			local72 = this.anIntArray133[arg0];
			if (local30 >= 50) {
				local85 = (50 - local34) * Static11.anIntArray161[local30 - local34];
				Static11.anIntArray154[local7] = local3 + (local63 + ((Static11.anIntArray146[local17] - local63) * local85 >> 16) << 9) / 50;
				Static11.anIntArray155[local7] = local5 + (local67 + ((Static11.anIntArray147[local17] - local67) * local85 >> 16) << 9) / 50;
				Static11.anIntArray156[local7++] = local72 + ((this.anIntArray132[arg0] - local72) * local85 >> 16);
			}
			if (local26 >= 50) {
				local85 = (50 - local34) * Static11.anIntArray161[local26 - local34];
				Static11.anIntArray154[local7] = local3 + (local63 + ((Static11.anIntArray146[local12] - local63) * local85 >> 16) << 9) / 50;
				Static11.anIntArray155[local7] = local5 + (local67 + ((Static11.anIntArray147[local12] - local67) * local85 >> 16) << 9) / 50;
				Static11.anIntArray156[local7++] = local72 + ((this.anIntArray131[arg0] - local72) * local85 >> 16);
			}
		}
		local63 = Static11.anIntArray154[0];
		local67 = Static11.anIntArray154[1];
		local72 = Static11.anIntArray154[2];
		local85 = Static11.anIntArray155[0];
		@Pc(582) int local582 = Static11.anIntArray155[1];
		@Pc(586) int local586 = Static11.anIntArray155[2];
		if ((local63 - local67) * (local586 - local582) - (local85 - local582) * (local72 - local67) <= 0) {
			return;
		}
		Static16.aBoolean159 = false;
		@Pc(629) int local629;
		@Pc(686) int local686;
		@Pc(691) int local691;
		@Pc(696) int local696;
		@Pc(701) int local701;
		if (local7 == 3) {
			if (local63 < 0 || local67 < 0 || local72 < 0 || local63 > Static14.anInt744 || local67 > Static14.anInt744 || local72 > Static14.anInt744) {
				Static16.aBoolean159 = true;
			}
			if (this.anIntArray134 == null) {
				local629 = 0;
			} else {
				local629 = this.anIntArray134[arg0] & 0x3;
			}
			if (local629 == 0) {
				Static16.method381(local85, local582, local586, local63, local67, local72, Static11.anIntArray156[0], Static11.anIntArray156[1], Static11.anIntArray156[2]);
			} else if (local629 == 1) {
				Static16.method383(local85, local582, local586, local63, local67, local72, Static11.anIntArray160[this.anIntArray131[arg0]]);
			} else if (local629 == 2) {
				local686 = this.anIntArray134[arg0] >> 2;
				local691 = this.anIntArray138[local686];
				local696 = this.anIntArray139[local686];
				local701 = this.anIntArray140[local686];
				Static16.method385(local85, local582, local586, local63, local67, local72, Static11.anIntArray156[0], Static11.anIntArray156[1], Static11.anIntArray156[2], Static11.anIntArray146[local691], Static11.anIntArray146[local696], Static11.anIntArray146[local701], Static11.anIntArray147[local691], Static11.anIntArray147[local696], Static11.anIntArray147[local701], Static11.anIntArray148[local691], Static11.anIntArray148[local696], Static11.anIntArray148[local701], this.anIntArray137[arg0]);
			} else if (local629 == 3) {
				local686 = this.anIntArray134[arg0] >> 2;
				local691 = this.anIntArray138[local686];
				local696 = this.anIntArray139[local686];
				local701 = this.anIntArray140[local686];
				Static16.method385(local85, local582, local586, local63, local67, local72, this.anIntArray131[arg0], this.anIntArray131[arg0], this.anIntArray131[arg0], Static11.anIntArray146[local691], Static11.anIntArray146[local696], Static11.anIntArray146[local701], Static11.anIntArray147[local691], Static11.anIntArray147[local696], Static11.anIntArray147[local701], Static11.anIntArray148[local691], Static11.anIntArray148[local696], Static11.anIntArray148[local701], this.anIntArray137[arg0]);
			}
		}
		if (local7 != 4) {
			return;
		}
		if (local63 < 0 || local67 < 0 || local72 < 0 || local63 > Static14.anInt744 || local67 > Static14.anInt744 || local72 > Static14.anInt744 || Static11.anIntArray154[3] < 0 || Static11.anIntArray154[3] > Static14.anInt744) {
			Static16.aBoolean159 = true;
		}
		if (this.anIntArray134 == null) {
			local629 = 0;
		} else {
			local629 = this.anIntArray134[arg0] & 0x3;
		}
		if (local629 == 0) {
			Static16.method381(local85, local582, local586, local63, local67, local72, Static11.anIntArray156[0], Static11.anIntArray156[1], Static11.anIntArray156[2]);
			Static16.method381(local85, local586, Static11.anIntArray155[3], local63, local72, Static11.anIntArray154[3], Static11.anIntArray156[0], Static11.anIntArray156[2], Static11.anIntArray156[3]);
			return;
		}
		if (local629 == 1) {
			local686 = Static11.anIntArray160[this.anIntArray131[arg0]];
			Static16.method383(local85, local582, local586, local63, local67, local72, local686);
			Static16.method383(local85, local586, Static11.anIntArray155[3], local63, local72, Static11.anIntArray154[3], local686);
			return;
		}
		if (local629 == 2) {
			local686 = this.anIntArray134[arg0] >> 2;
			local691 = this.anIntArray138[local686];
			local696 = this.anIntArray139[local686];
			local701 = this.anIntArray140[local686];
			Static16.method385(local85, local582, local586, local63, local67, local72, Static11.anIntArray156[0], Static11.anIntArray156[1], Static11.anIntArray156[2], Static11.anIntArray146[local691], Static11.anIntArray146[local696], Static11.anIntArray146[local701], Static11.anIntArray147[local691], Static11.anIntArray147[local696], Static11.anIntArray147[local701], Static11.anIntArray148[local691], Static11.anIntArray148[local696], Static11.anIntArray148[local701], this.anIntArray137[arg0]);
			Static16.method385(local85, local586, Static11.anIntArray155[3], local63, local72, Static11.anIntArray154[3], Static11.anIntArray156[0], Static11.anIntArray156[2], Static11.anIntArray156[3], Static11.anIntArray146[local691], Static11.anIntArray146[local696], Static11.anIntArray146[local701], Static11.anIntArray147[local691], Static11.anIntArray147[local696], Static11.anIntArray147[local701], Static11.anIntArray148[local691], Static11.anIntArray148[local696], Static11.anIntArray148[local701], this.anIntArray137[arg0]);
			return;
		}
		if (local629 != 3) {
			return;
		}
		local686 = this.anIntArray134[arg0] >> 2;
		local691 = this.anIntArray138[local686];
		local696 = this.anIntArray139[local686];
		local701 = this.anIntArray140[local686];
		Static16.method385(local85, local582, local586, local63, local67, local72, this.anIntArray131[arg0], this.anIntArray131[arg0], this.anIntArray131[arg0], Static11.anIntArray146[local691], Static11.anIntArray146[local696], Static11.anIntArray146[local701], Static11.anIntArray147[local691], Static11.anIntArray147[local696], Static11.anIntArray147[local701], Static11.anIntArray148[local691], Static11.anIntArray148[local696], Static11.anIntArray148[local701], this.anIntArray137[arg0]);
		Static16.method385(local85, local586, Static11.anIntArray155[3], local63, local72, Static11.anIntArray154[3], this.anIntArray131[arg0], this.anIntArray131[arg0], this.anIntArray131[arg0], Static11.anIntArray146[local691], Static11.anIntArray146[local696], Static11.anIntArray146[local701], Static11.anIntArray147[local691], Static11.anIntArray147[local696], Static11.anIntArray147[local701], Static11.anIntArray148[local691], Static11.anIntArray148[local696], Static11.anIntArray148[local701], this.anIntArray137[arg0]);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}
}
