import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ec")
public final class Class9 {

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Z")
	public boolean aBoolean115;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
	private boolean aBoolean119;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Z")
	public boolean aBoolean120;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "B")
	private byte aByte20;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "B")
	private byte aByte21;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Z")
	private boolean aBoolean121;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
	public boolean aBoolean122;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	private int anInt529;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "B")
	private byte aByte19 = 8;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	public int anInt518 = -1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	public void method259() {
		this.anIntArray117 = null;
		this.anIntArray118 = null;
		this.aString24 = null;
		this.aByteArray4 = null;
		this.anIntArray119 = null;
		this.anIntArray120 = null;
		this.anInt519 = 1;
		this.anInt520 = 1;
		this.aBoolean115 = true;
		this.aBoolean116 = true;
		this.aBoolean117 = false;
		this.aBoolean118 = false;
		this.aBoolean119 = false;
		this.aBoolean120 = false;
		this.anInt521 = -1;
		this.anInt522 = 16;
		this.aByte20 = 0;
		this.aByte21 = 0;
		this.aStringArray8 = null;
		this.anInt523 = -1;
		this.anInt524 = -1;
		this.aBoolean121 = false;
		this.aBoolean122 = true;
		this.anInt525 = 128;
		this.anInt526 = 128;
		this.anInt527 = 128;
		this.anInt531 = 0;
		this.anInt528 = 0;
		this.anInt529 = 0;
		this.anInt530 = 0;
		this.aBoolean123 = false;
		this.aBoolean124 = false;
		this.anInt532 = -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!mb;)V")
	public void method260(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		try {
			if (arg0 != 9) {
				throw new NullPointerException();
			}
			@Pc(10) int local10 = -1;
			while (true) {
				@Pc(21) int local21;
				@Pc(33) int local33;
				do {
					while (true) {
						@Pc(13) int local13 = arg1.readUByte();
						if (local13 == 0) {
							if (local10 == -1) {
								this.aBoolean117 = false;
								if (this.anIntArray117 != null && (this.anIntArray118 == null || this.anIntArray118[0] == 10)) {
									this.aBoolean117 = true;
								}
								if (this.aStringArray8 != null) {
									this.aBoolean117 = true;
								}
							}
							if (this.aBoolean124) {
								this.aBoolean115 = false;
								this.aBoolean116 = false;
							}
							if (this.anInt532 == -1) {
								this.anInt532 = this.aBoolean115 ? 1 : 0;
								return;
							}
							return;
						}
						if (local13 == 1) {
							local21 = arg1.readUByte();
							break;
						}
						if (local13 == 2) {
							this.aString24 = arg1.readString();
						} else if (local13 == 3) {
							this.aByteArray4 = arg1.getStringArray();
						} else if (local13 == 5) {
							local21 = arg1.readUByte();
							if (local21 > 0) {
								this.anIntArray118 = null;
								this.anIntArray117 = new int[local21];
								for (local33 = 0; local33 < local21; local33++) {
									this.anIntArray117[local33] = arg1.readUShortLE();
								}
							}
						} else if (local13 == 14) {
							this.anInt519 = arg1.readUByte();
						} else if (local13 == 15) {
							this.anInt520 = arg1.readUByte();
						} else if (local13 == 17) {
							this.aBoolean115 = false;
						} else if (local13 == 18) {
							this.aBoolean116 = false;
						} else if (local13 == 19) {
							local10 = arg1.readUByte();
							if (local10 == 1) {
								this.aBoolean117 = true;
							}
						} else if (local13 == 21) {
							this.aBoolean118 = true;
						} else if (local13 == 22) {
							this.aBoolean119 = true;
						} else if (local13 == 23) {
							this.aBoolean120 = true;
						} else if (local13 == 24) {
							this.anInt521 = arg1.readUShortLE();
							if (this.anInt521 == 65535) {
								this.anInt521 = -1;
							}
						} else if (local13 == 28) {
							this.anInt522 = arg1.readUByte();
						} else if (local13 == 29) {
							this.aByte20 = arg1.readByte();
						} else if (local13 == 39) {
							this.aByte21 = arg1.readByte();
						} else if (local13 >= 30 && local13 < 39) {
							if (this.aStringArray8 == null) {
								this.aStringArray8 = new String[5];
							}
							this.aStringArray8[local13 - 30] = arg1.readString();
							if (this.aStringArray8[local13 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray8[local13 - 30] = null;
							}
						} else if (local13 == 40) {
							local21 = arg1.readUByte();
							this.anIntArray119 = new int[local21];
							this.anIntArray120 = new int[local21];
							for (local33 = 0; local33 < local21; local33++) {
								this.anIntArray119[local33] = arg1.readUShortLE();
								this.anIntArray120[local33] = arg1.readUShortLE();
							}
						} else if (local13 == 60) {
							this.anInt523 = arg1.readUShortLE();
						} else if (local13 == 62) {
							this.aBoolean121 = true;
						} else if (local13 == 64) {
							this.aBoolean122 = false;
						} else if (local13 == 65) {
							this.anInt525 = arg1.readUShortLE();
						} else if (local13 == 66) {
							this.anInt526 = arg1.readUShortLE();
						} else if (local13 == 67) {
							this.anInt527 = arg1.readUShortLE();
						} else if (local13 == 68) {
							this.anInt524 = arg1.readUShortLE();
						} else if (local13 == 69) {
							this.anInt531 = arg1.readUByte();
						} else if (local13 == 70) {
							this.anInt528 = arg1.readUShortBE();
						} else if (local13 == 71) {
							this.anInt529 = arg1.readUShortBE();
						} else if (local13 == 72) {
							this.anInt530 = arg1.readUShortBE();
						} else if (local13 == 73) {
							this.aBoolean123 = true;
						} else if (local13 == 74) {
							this.aBoolean124 = true;
						} else if (local13 == 75) {
							this.anInt532 = arg1.readUByte();
						}
					}
				} while (local21 <= 0);
				this.anIntArray118 = new int[local21];
				this.anIntArray117 = new int[local21];
				for (local33 = 0; local33 < local21; local33++) {
					this.anIntArray117[local33] = arg1.readUShortLE();
					this.anIntArray118[local33] = arg1.readUByte();
				}
			}
		} catch (@Pc(465) RuntimeException local465) {
			signlink.reporterror("16374, " + arg0 + ", " + arg1 + ", " + local465.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Z")
	public boolean method261(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.aBoolean114 = !this.aBoolean114;
			}
			if (this.anIntArray118 != null) {
				for (@Pc(50) int local50 = 0; local50 < this.anIntArray118.length; local50++) {
					if (this.anIntArray118[local50] == arg0) {
						return Static11.method289(this.anIntArray117[local50] & 0xFFFF);
					}
				}
				return true;
			} else if (this.anIntArray117 == null) {
				return true;
			} else if (arg0 == 10) {
				@Pc(26) boolean local26 = true;
				for (@Pc(28) int local28 = 0; local28 < this.anIntArray117.length; local28++) {
					local26 &= Static11.method289(this.anIntArray117[local28] & 0xFFFF);
				}
				return local26;
			} else {
				return true;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("257, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Z")
	public boolean method262(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			} else if (this.anIntArray117 == null) {
				return true;
			} else {
				@Pc(12) boolean local12 = true;
				for (@Pc(14) int local14 = 0; local14 < this.anIntArray117.length; local14++) {
					local12 &= Static11.method289(this.anIntArray117[local14] & 0xFFFF);
				}
				return local12;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("47255, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!vb;)V")
	public void method263(@OriginalArg(0) int arg0, @OriginalArg(1) Class45_Sub1 arg1) {
		try {
			if (arg0 == 38488 && this.anIntArray117 != null) {
				for (@Pc(9) int local9 = 0; local9 < this.anIntArray117.length; local9++) {
					arg1.method662(0, this.anIntArray117[local9] & 0xFFFF, 0);
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("75547, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = this.method265(arg0, (byte) 7, arg6, arg1);
		if (local6 == null) {
			return null;
		}
		if (this.aBoolean118 || this.aBoolean119) {
			local6 = new Class1_Sub1_Sub1_Sub5((byte) 9, this.aBoolean118, local6, this.aBoolean119);
		}
		if (this.aBoolean118) {
			@Pc(39) int local39 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (@Pc(41) int local41 = 0; local41 < local6.anInt543; local41++) {
				@Pc(48) int local48 = local6.anIntArray125[local41];
				@Pc(53) int local53 = local6.anIntArray127[local41];
				@Pc(65) int local65 = arg2 + (arg3 - arg2) * (local48 + 64) / 128;
				@Pc(77) int local77 = arg5 + (arg4 - arg5) * (local48 + 64) / 128;
				@Pc(89) int local89 = local65 + (local77 - local65) * (local53 + 64) / 128;
				local6.anIntArray126[local41] += local89 - local39;
			}
			local6.method293(true);
		}
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBII)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method265(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = null;
			if (arg1 != 7) {
				throw new NullPointerException();
			}
			@Pc(8) boolean local8 = false;
			@Pc(37) long local37;
			@Pc(61) boolean local61;
			@Pc(67) int local67;
			@Pc(181) Class1_Sub1_Sub1_Sub5 local181;
			if (this.anIntArray118 == null) {
				if (arg0 != 10) {
					return null;
				}
				local37 = (long) ((this.anInt518 << 6) + arg3) + ((long) (arg2 + 1) << 32);
				@Pc(42) Class1_Sub1_Sub1_Sub5 local42 = (Class1_Sub1_Sub1_Sub5) Static9.aClass42_5.method641(local37);
				if (local42 != null) {
					return local42;
				}
				if (this.anIntArray117 == null) {
					return null;
				}
				local61 = this.aBoolean121 ^ arg3 > 3;
				@Pc(65) int local65 = this.anIntArray117.length;
				for (local67 = 0; local67 < local65; local67++) {
					@Pc(73) int local73 = this.anIntArray117[local67];
					if (local61) {
						local73 += 65536;
					}
					local3 = (Class1_Sub1_Sub1_Sub5) Static9.aClass42_4.method641((long) local73);
					if (local3 == null) {
						local3 = Static11.method288(0, local73 & 0xFFFF);
						if (local3 == null) {
							return null;
						}
						if (local61) {
							local3.method303((byte) 15);
						}
						Static9.aClass42_4.method642(local3, false, (long) local73);
					}
					if (local65 > 1) {
						Static9.aClass1_Sub1_Sub1_Sub5Array1[local67] = local3;
					}
				}
				if (local65 > 1) {
					local3 = new Class1_Sub1_Sub1_Sub5(Static9.aClass1_Sub1_Sub1_Sub5Array1, local65, -928);
				}
			} else {
				@Pc(132) int local132 = -1;
				for (@Pc(134) int local134 = 0; local134 < this.anIntArray118.length; local134++) {
					if (this.anIntArray118[local134] == arg0) {
						local132 = local134;
						break;
					}
				}
				if (local132 == -1) {
					return null;
				}
				local37 = (long) ((this.anInt518 << 6) + (local132 << 3) + arg3) + ((long) (arg2 + 1) << 32);
				local181 = (Class1_Sub1_Sub1_Sub5) Static9.aClass42_5.method641(local37);
				if (local181 != null) {
					return local181;
				}
				local67 = this.anIntArray117[local132];
				@Pc(200) boolean local200 = this.aBoolean121 ^ arg3 > 3;
				if (local200) {
					local67 += 65536;
				}
				local3 = (Class1_Sub1_Sub1_Sub5) Static9.aClass42_4.method641((long) local67);
				if (local3 == null) {
					local3 = Static11.method288(0, local67 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local200) {
						local3.method303((byte) 15);
					}
					Static9.aClass42_4.method642(local3, false, (long) local67);
				}
			}
			@Pc(249) boolean local249;
			if (this.anInt525 == 128 && this.anInt526 == 128 && this.anInt527 == 128) {
				local249 = false;
			} else {
				local249 = true;
			}
			if (this.anInt528 == 0 && this.anInt529 == 0 && this.anInt530 == 0) {
				local61 = false;
			} else {
				local61 = true;
			}
			local181 = new Class1_Sub1_Sub1_Sub5(Static13.method328((byte) 8, arg2), 992, arg3 == 0 && arg2 == -1 && !local249 && !local61, this.anIntArray119 == null, local3);
			if (arg2 != -1) {
				local181.method295((byte) 112);
				local181.method296(true, arg2);
				local181.anIntArrayArray8 = null;
				local181.anIntArrayArray7 = null;
			}
			while (arg3-- > 0) {
				local181.method299(this.aByte19);
			}
			if (this.anIntArray119 != null) {
				for (local67 = 0; local67 < this.anIntArray119.length; local67++) {
					local181.method302(this.anIntArray119[local67], this.anIntArray120[local67]);
				}
			}
			if (local249) {
				local181.method304(792, this.anInt527, this.anInt525, this.anInt526);
			}
			if (local61) {
				local181.method301((byte) -32, this.anInt528, this.anInt530, this.anInt529);
			}
			local181.method305(this.aByte20 + 64, this.aByte21 * 5 + 768, -50, -10, -50, !this.aBoolean119);
			if (this.anInt532 == 1) {
				local181.anInt555 = local181.anInt566;
			}
			Static9.aClass42_5.method642(local181, false, local37);
			return local181;
		} catch (@Pc(402) RuntimeException local402) {
			signlink.reporterror("65033, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local402.toString());
			throw new RuntimeException();
		}
	}
}
