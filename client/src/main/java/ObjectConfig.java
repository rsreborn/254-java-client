import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

/**
 *
 * Credits:
 * TheDaneEffect's 317 client renaming for member variable names
 *
 */

@OriginalClass("client!hc")
public final class ObjectConfig {

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	private int modelId;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Ljava/lang/String;")
	public String name;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "[B")
	public byte[] examine;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
	private int[] originalColor;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[I")
	private int[] overrideColor;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	public int iconZoom;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	public int iconPitch;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	public int iconYaw;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
	public int iconOffsetX;

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
	public int iconOffsetY;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
	private int anInt620;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "Z")
	public boolean isStackable;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
	public int highAlchValue;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Z")
	public boolean isMembers;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "[Ljava/lang/String;")
	public String[] groundOptions;

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "[Ljava/lang/String;")
	public String[] inventoryOptions;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
	private int anInt622;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	private int anInt623;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "B")
	private byte aByte28;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
	private int anInt625;

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "B")
	private byte aByte29;

	@OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "[I")
	public int[] anIntArray179;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
	public int linkedId;

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	public int notedId;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
	private int anInt637;

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	private int anInt608 = 614;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public int anInt612 = -1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	public void method346() {
		this.modelId = 0;
		this.name = null;
		this.examine = null;
		this.originalColor = null;
		this.overrideColor = null;
		this.iconZoom = 2000;
		this.iconPitch = 0;
		this.iconYaw = 0;
		this.anInt617 = 0;
		this.iconOffsetX = 0;
		this.iconOffsetY = 0;
		this.anInt620 = -1;
		this.isStackable = false;
		this.highAlchValue = 1;
		this.isMembers = false;
		this.groundOptions = null;
		this.inventoryOptions = null;
		this.anInt622 = -1;
		this.anInt623 = -1;
		this.aByte28 = 0;
		this.anInt624 = -1;
		this.anInt625 = -1;
		this.aByte29 = 0;
		this.anInt626 = -1;
		this.anInt627 = -1;
		this.anInt628 = -1;
		this.anInt629 = -1;
		this.anInt630 = -1;
		this.anInt631 = -1;
		this.anIntArray178 = null;
		this.anIntArray179 = null;
		this.linkedId = -1;
		this.notedId = -1;
		this.anInt634 = 128;
		this.anInt635 = 128;
		this.anInt636 = 128;
		this.anInt637 = 0;
		this.anInt638 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!mb;)V")
	public void readDefinition(@OriginalArg(1) Buffer buffer) {
		while (true) {
			int code = buffer.readUByte();
			if (code == 0) {
				return;
			}
			if (code == 1) {
				this.modelId = buffer.readUShortBE();
			} else if (code == 2) {
				this.name = buffer.readString();
			} else if (code == 3) {
				this.examine = buffer.readStringBytes();
			} else if (code == 4) {
				this.iconZoom = buffer.readUShortBE();
			} else if (code == 5) {
				this.iconPitch = buffer.readUShortBE();
			} else if (code == 6) {
				this.iconYaw = buffer.readUShortBE();
			} else if (code == 7) {
				this.iconOffsetX = buffer.readUShortBE();
				if (this.iconOffsetX > 32767) {
					this.iconOffsetX -= 65536;
				}
			} else if (code == 8) {
				this.iconOffsetY = buffer.readUShortBE();
				if (this.iconOffsetY > 32767) {
					this.iconOffsetY -= 65536;
				}
			} else if (code == 10) {
				this.anInt620 = buffer.readUShortBE();
			} else if (code == 11) {
				this.isStackable = true;
			} else if (code == 12) {
				this.highAlchValue = buffer.readIntBE();
			} else if (code == 16) {
				this.isMembers = true;
			} else if (code == 23) {
				this.anInt622 = buffer.readUShortBE();
				this.aByte28 = buffer.readByte();
			} else if (code == 24) {
				this.anInt623 = buffer.readUShortBE();
			} else if (code == 25) {
				this.anInt624 = buffer.readUShortBE();
				this.aByte29 = buffer.readByte();
			} else if (code == 26) {
				this.anInt625 = buffer.readUShortBE();
			} else if (code >= 30 && code < 35) {
				if (this.groundOptions == null) {
					this.groundOptions = new String[5];
				}
				this.groundOptions[code - 30] = buffer.readString();
				if (this.groundOptions[code - 30].equalsIgnoreCase("hidden")) {
					this.groundOptions[code - 30] = null;
				}

			} else if (code >= 35 && code < 40) {
				if (this.inventoryOptions == null) {
					this.inventoryOptions = new String[5];
				}
				this.inventoryOptions[code - 35] = buffer.readString();
			} else if (code == 40) {
				@Pc(259) int recolorCount = buffer.readUByte();
				this.originalColor = new int[recolorCount];
				this.overrideColor = new int[recolorCount];
				for (@Pc(269) int local269 = 0; local269 < recolorCount; local269++) {
					this.originalColor[local269] = buffer.readUShortBE();
					this.overrideColor[local269] = buffer.readUShortBE();
				}
			} else if (code == 78) {
				this.anInt626 = buffer.readUShortBE();
			} else if (code == 79) {
				this.anInt627 = buffer.readUShortBE();
			} else if (code == 90) {
				this.anInt628 = buffer.readUShortBE();
			} else if (code == 91) {
				this.anInt630 = buffer.readUShortBE();
			} else if (code == 92) {
				this.anInt629 = buffer.readUShortBE();
			} else if (code == 93) {
				this.anInt631 = buffer.readUShortBE();
			} else if (code == 95) {
				this.anInt617 = buffer.readUShortBE();
			} else if (code == 97) {
				this.linkedId = buffer.readUShortBE();
			} else if (code == 98) {
				this.notedId = buffer.readUShortBE();
			} else if (code >= 100 && code < 110) {
				if (this.anIntArray178 == null) {
					this.anIntArray178 = new int[10];
					this.anIntArray179 = new int[10];
				}
				this.anIntArray178[code - 100] = buffer.readUShortBE();
				this.anIntArray179[code - 100] = buffer.readUShortBE();
			} else if (code == 110) {
				this.anInt634 = buffer.readUShortBE();
			} else if (code == 111) {
				this.anInt635 = buffer.readUShortBE();
			} else if (code == 112) {
				this.anInt636 = buffer.readUShortBE();
			} else if (code == 113) {
				this.anInt637 = buffer.readByte();
			} else if (code == 114) {
				this.anInt638 = buffer.readByte() * 5;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	public void method348(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) ObjectConfig local3 = Static15.method345(this.notedId);
			this.modelId = local3.modelId;
			this.iconZoom = local3.iconZoom;
			this.iconPitch = local3.iconPitch;
			this.iconYaw = local3.iconYaw;
			this.anInt617 = local3.anInt617;
			this.iconOffsetX = local3.iconOffsetX;
			this.iconOffsetY = local3.iconOffsetY;
			this.originalColor = local3.originalColor;
			this.overrideColor = local3.overrideColor;
			@Pc(43) ObjectConfig local43 = Static15.method345(this.linkedId);
			this.name = local43.name;
			this.isMembers = local43.isMembers;
			this.highAlchValue = local43.highAlchValue;
			if (arg0) {
				this.aBoolean150 = !this.aBoolean150;
			}
			@Pc(67) String local67 = "a";
			@Pc(72) char local72 = local43.name.charAt(0);
			if (local72 == 'A' || local72 == 'E' || local72 == 'I' || local72 == 'O' || local72 == 'U') {
				local67 = "an";
			}
			this.examine = ("Swap this note at any bank for " + local67 + " " + local43.name + ".").getBytes();
			this.isStackable = true;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("27153, " + arg0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method349(@OriginalArg(0) int arg0) {
		@Pc(11) int local11;
		if (this.anIntArray178 != null && arg0 > 1) {
			@Pc(9) int local9 = -1;
			for (local11 = 0; local11 < 10; local11++) {
				if (arg0 >= this.anIntArray179[local11] && this.anIntArray179[local11] != 0) {
					local9 = this.anIntArray178[local11];
				}
			}
			if (local9 != -1) {
				return Static15.method345(local9).method349(1);
			}
		}
		@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = (Class1_Sub1_Sub1_Sub5) Static15.aClass42_7.method641((long) this.anInt612);
		if (local48 != null) {
			return local48;
		}
		local48 = Static11.method288(0, this.modelId);
		if (local48 == null) {
			return null;
		}
		if (this.anInt634 != 128 || this.anInt635 != 128 || this.anInt636 != 128) {
			local48.method304(792, this.anInt636, this.anInt634, this.anInt635);
		}
		if (this.originalColor != null) {
			for (local11 = 0; local11 < this.originalColor.length; local11++) {
				local48.method302(this.originalColor[local11], this.overrideColor[local11]);
			}
		}
		local48.method305(this.anInt637 + 64, this.anInt638 + 768, -50, -10, -50, true);
		local48.aBoolean133 = true;
		Static15.aClass42_7.method642(local48, false, (long) this.anInt612);
		return local48;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(11) int local11;
			if (this.anIntArray178 != null && arg1 > 1) {
				@Pc(9) int local9 = -1;
				for (local11 = 0; local11 < 10; local11++) {
					if (arg1 >= this.anIntArray179[local11] && this.anIntArray179[local11] != 0) {
						local9 = this.anIntArray178[local11];
					}
				}
				if (local9 != -1) {
					return Static15.method345(local9).method350(614, 1);
				}
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47 = Static11.method288(0, this.modelId);
			@Pc(51) int local51 = 37 / arg0;
			if (local47 == null) {
				return null;
			}
			if (this.originalColor != null) {
				for (local11 = 0; local11 < this.originalColor.length; local11++) {
					local47.method302(this.originalColor[local11], this.overrideColor[local11]);
				}
			}
			return local47;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("45345, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Z")
	public boolean method352(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = this.anInt622;
			@Pc(5) int local5 = this.anInt623;
			@Pc(8) int local8 = this.anInt626;
			if (arg1 == 1) {
				local2 = this.anInt624;
				local5 = this.anInt625;
				local8 = this.anInt627;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(27) boolean local27 = true;
			if (arg0 != 3) {
				this.anInt608 = -359;
			}
			if (!Static11.method289(local2)) {
				local27 = false;
			}
			if (local5 != -1 && !Static11.method289(local5)) {
				local27 = false;
			}
			if (local8 != -1 && !Static11.method289(local8)) {
				local27 = false;
			}
			return local27;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("75030, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = 57 / arg0;
			@Pc(8) int local8 = this.anInt622;
			@Pc(11) int local11 = this.anInt623;
			@Pc(14) int local14 = this.anInt626;
			if (arg1 == 1) {
				local8 = this.anInt624;
				local11 = this.anInt625;
				local14 = this.anInt627;
			}
			if (local8 == -1) {
				return null;
			}
			@Pc(35) Class1_Sub1_Sub1_Sub5 local35 = Static11.method288(0, local8);
			if (local11 != -1) {
				@Pc(45) Class1_Sub1_Sub1_Sub5 local45;
				if (local14 == -1) {
					local45 = Static11.method288(0, local11);
					@Pc(88) Class1_Sub1_Sub1_Sub5[] local88 = new Class1_Sub1_Sub1_Sub5[] { local35, local45 };
					local35 = new Class1_Sub1_Sub1_Sub5(local88, 2, -928);
				} else {
					local45 = Static11.method288(0, local11);
					@Pc(49) Class1_Sub1_Sub1_Sub5 local49 = Static11.method288(0, local14);
					@Pc(64) Class1_Sub1_Sub1_Sub5[] local64 = new Class1_Sub1_Sub1_Sub5[] { local35, local45, local49 };
					local35 = new Class1_Sub1_Sub1_Sub5(local64, 3, -928);
				}
			}
			if (arg1 == 0 && this.aByte28 != 0) {
				local35.method301((byte) -32, 0, 0, this.aByte28);
			}
			if (arg1 == 1 && this.aByte29 != 0) {
				local35.method301((byte) -32, 0, 0, this.aByte29);
			}
			if (this.originalColor != null) {
				for (@Pc(125) int local125 = 0; local125 < this.originalColor.length; local125++) {
					local35.method302(this.originalColor[local125], this.overrideColor[local125]);
				}
			}
			return local35;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("54885, " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)Z")
	public boolean method354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) int local2 = this.anInt628;
			@Pc(5) int local5 = this.anInt629;
			if (arg1 == 1) {
				local2 = this.anInt630;
				local5 = this.anInt631;
			}
			if (local2 == -1) {
				return true;
			}
			@Pc(21) boolean local21 = true;
			if (arg0) {
				this.aBoolean149 = !this.aBoolean149;
			}
			if (!Static11.method289(local2)) {
				local21 = false;
			}
			if (local5 != -1 && !Static11.method289(local5)) {
				local21 = false;
			}
			return local21;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("57264, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(ZI)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method355(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (!arg0) {
				this.anInt608 = -367;
			}
			@Pc(7) int local7 = this.anInt628;
			@Pc(10) int local10 = this.anInt629;
			if (arg1 == 1) {
				local7 = this.anInt630;
				local10 = this.anInt631;
			}
			if (local7 == -1) {
				return null;
			}
			@Pc(28) Class1_Sub1_Sub1_Sub5 local28 = Static11.method288(0, local7);
			if (local10 != -1) {
				@Pc(35) Class1_Sub1_Sub1_Sub5 local35 = Static11.method288(0, local10);
				@Pc(46) Class1_Sub1_Sub1_Sub5[] local46 = new Class1_Sub1_Sub1_Sub5[] { local28, local35 };
				local28 = new Class1_Sub1_Sub1_Sub5(local46, 2, -928);
			}
			if (this.originalColor != null) {
				for (@Pc(58) int local58 = 0; local58 < this.originalColor.length; local58++) {
					local28.method302(this.originalColor[local58], this.overrideColor[local58]);
				}
			}
			return local28;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("64626, " + arg0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
