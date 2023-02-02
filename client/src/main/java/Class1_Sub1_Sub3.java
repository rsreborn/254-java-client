import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[I")
	private static int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[B")
	public byte[] payload;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int position;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!xb;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt771 = -742;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private int anInt772 = -13;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "B")
	private byte aByte43 = 78;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	private int anInt773 = -106;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	private int anInt774 = 430;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	private int anInt775 = 2;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	private int anInt776 = 977;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "[C")
	private char[] aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray225[local6] = local9;
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				for (@Pc(295) int local295 = 1; local295 > 0; local295++) {
				}
			}
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("9581, " + arg0 + ", " + local302.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([BB)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 3) {
				throw new NullPointerException();
			}
			@Pc(298) boolean local298 = false;
			this.payload = arg0;
			this.position = 0;
		} catch (@Pc(318) RuntimeException local318) {
			signlink.reporterror("68607, " + arg0 + ", " + arg1 + ", " + local318.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method486(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) Class31 local1 = Static21.aClass31_5;
			synchronized (Static21.aClass31_5) {
				this.position = 0;
				if (this.payload.length == 100 && Static21.anInt779 < 1000) {
					Static21.aClass31_4.method520(this);
					Static21.anInt779++;
					return;
				}
				if (this.payload.length == 5000 && Static21.anInt780 < 250) {
					Static21.aClass31_5.method520(this);
					Static21.anInt780++;
					return;
				}
				if (this.payload.length == 30000 && Static21.anInt781 < 50) {
					Static21.aClass31_6.method520(this);
					Static21.anInt781++;
					return;
				}
			}
			if (arg0 >= 0) {
				;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("62987, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void writeOpcode(@OriginalArg(1) int arg1) {
		this.payload[this.position++] = (byte) (arg1 + this.aClass47_2.method674());
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method488(@OriginalArg(0) int arg0) {
		this.payload[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method489(@OriginalArg(0) int arg0) {
		this.payload[this.position++] = (byte) (arg0 >> 8);
		this.payload[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.payload[this.position++] = (byte) arg0;
			if (arg1 != 1) {
				for (@Pc(16) int local16 = 1; local16 > 0; local16++) {
				}
			}
			this.payload[this.position++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("11383, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method491(@OriginalArg(0) int arg0) {
		this.payload[this.position++] = (byte) (arg0 >> 16);
		this.payload[this.position++] = (byte) (arg0 >> 8);
		this.payload[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public void method492(@OriginalArg(0) int arg0) {
		this.payload[this.position++] = (byte) (arg0 >> 24);
		this.payload[this.position++] = (byte) (arg0 >> 16);
		this.payload[this.position++] = (byte) (arg0 >> 8);
		this.payload[this.position++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
	public void method493(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.payload[this.position++] = (byte) arg0;
			this.payload[this.position++] = (byte) (arg0 >> 8);
			this.payload[this.position++] = (byte) (arg0 >> 16);
			if (arg1 == 116) {
				this.payload[this.position++] = (byte) (arg0 >> 24);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("17813, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)V")
	public void method494(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			this.payload[this.position++] = (byte) (arg1 >> 56);
			this.payload[this.position++] = (byte) (arg1 >> 48);
			this.payload[this.position++] = (byte) (arg1 >> 40);
			this.payload[this.position++] = (byte) (arg1 >> 32);
			this.payload[this.position++] = (byte) (arg1 >> 24);
			this.payload[this.position++] = (byte) (arg1 >> 16);
			if (arg0 > 0) {
				this.payload[this.position++] = (byte) (arg1 >> 8);
				this.payload[this.position++] = (byte) arg1;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("82080, " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method495(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.payload, this.position);
		this.position += arg0.length();
		this.payload[this.position++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BIZ)V")
	public void method496(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(5) int local5;
			if (arg3) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			for (local5 = arg0; local5 < arg0 + arg2; local5++) {
				this.payload[this.position++] = arg1[local5];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("22473, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public void method497(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			this.payload[this.position - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("4960, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int readUByte() {
		return this.payload[this.position++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte readByte() {
		return this.payload[this.position++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int readUShortLE() {
		this.position += 2;
		return ((this.payload[this.position - 2] & 0xFF) << 8) + (this.payload[this.position - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int readUShortBE() {
		this.position += 2;
		@Pc(27) int value = ((this.payload[this.position - 2] & 0xFF) << 8) + (this.payload[this.position - 1] & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int get3() {
		this.position += 3;
		return ((this.payload[this.position - 3] & 0xFF) << 16) + ((this.payload[this.position - 2] & 0xFF) << 8) + (this.payload[this.position - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int readIntBE() {
		this.position += 4;
		return ((this.payload[this.position - 4] & 0xFF) << 24) + ((this.payload[this.position - 3] & 0xFF) << 16) + ((this.payload[this.position - 2] & 0xFF) << 8) + (this.payload[this.position - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)J")
	public long readLongBE() {
		@Pc(5) long msi = (long) this.readIntBE() & 0xFFFFFFFFL;
		@Pc(21) long lsi = (long) this.readIntBE() & 0xFFFFFFFFL;
		return (msi << 32) + lsi;
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String readString() {
		@Pc(2) int start = this.position;
		while (this.payload[this.position++] != 10) ;
		return new String(this.payload, start, this.position - start - 1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)[B")
	public byte[] getStringArray(@OriginalArg(0) byte arg0) {
		@Pc(2) int local2 = this.position;
		if (arg0 != 3) {
			throw new NullPointerException();
		}
		while (this.payload[this.position++] != 10);
		@Pc(29) byte[] local29 = new byte[this.position - local2 - 1];
		for (@Pc(31) int local31 = local2; local31 < this.position - 1; local31++) {
			local29[local31 - local2] = this.payload[local31];
		}
		return local29;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[BI)V")
	public void getArray(@OriginalArg(2) byte[] bytes, @OriginalArg(0) int start, @OriginalArg(3) int length) {
		for (@Pc(8) int pos = start; pos < start + length; pos++) {
			bytes[pos] = this.payload[this.position++];
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void accessBits(@OriginalArg(0) int arg0) {
		try {
			this.anInt778 = this.position * 8;
			if (arg0 == 0) {
				;
			}
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("40903, " + arg0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	public int getBit(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 >= 0) {
				this.anInt770 = -221;
			}
			@Pc(11) int local11 = this.anInt778 >> 3;
			@Pc(18) int local18 = 8 - (this.anInt778 & 0x7);
			@Pc(20) int local20 = 0;
			this.anInt778 += arg1;
			while (arg1 > local18) {
				local20 += (this.payload[local11++] & Static21.anIntArray226[local18]) << arg1 - local18;
				arg1 -= local18;
				local18 = 8;
			}
			if (arg1 == local18) {
				local20 += this.payload[local11] & Static21.anIntArray226[local18];
			} else {
				local20 += this.payload[local11] >> local18 - arg1 & Static21.anIntArray226[arg1];
			}
			return local20;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("3324, " + arg0 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public void accessBytes(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.anInt770 = -31;
			}
			this.position = (this.anInt778 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("5222, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method511() {
		@Pc(7) int local7 = this.payload[this.position] & 0xFF;
		return local7 < 128 ? this.readUByte() - 64 : this.readUShortLE() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int getSmart() {
		@Pc(7) int local7 = this.payload[this.position] & 0xFF;
		return local7 < 128 ? this.readUByte() : this.readUShortLE() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void encrpyt(@OriginalArg(1) BigInteger key, @OriginalArg(2) BigInteger modulus) {
			@Pc(2) int length = this.position;
			this.position = 0;
			@Pc(8) byte[] bytes = new byte[length];
			this.getArray(bytes, 0, length);
			@Pc(25) BigInteger exponent = new BigInteger(bytes);
			@Pc(30) BigInteger mod = exponent.modPow(key, modulus);

			@Pc(33) byte[] encrypted = mod.toByteArray();
			this.position = 0;
			this.method488(encrypted.length);
			this.method496(0, encrypted, encrypted.length, false);
	}
}
