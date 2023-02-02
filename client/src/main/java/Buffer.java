import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Buffer extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[I")
	private static int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[B")
	public byte[] payload;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int position;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public int bitPosition;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!xb;")
	public Class47 aClass47_2;

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
	public Buffer(@OriginalArg(0) int arg0) {
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
	public Buffer(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
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
	public void writeOpcode(@OriginalArg(1) int opcode) {
		this.payload[this.position++] = (byte) (opcode + this.aClass47_2.method674());
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method488(@OriginalArg(0) int value) {
		this.payload[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method489(@OriginalArg(0) int value) {
		this.payload[this.position++] = (byte) (value >> 8);
		this.payload[this.position++] = (byte) value;
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
	public void writeMiddleBE(@OriginalArg(0) int value) {
		this.payload[this.position++] = (byte) (value >> 16);
		this.payload[this.position++] = (byte) (value >> 8);
		this.payload[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public void writeIntBE(@OriginalArg(0) int value) {
		this.payload[this.position++] = (byte) (value >> 24);
		this.payload[this.position++] = (byte) (value >> 16);
		this.payload[this.position++] = (byte) (value >> 8);
		this.payload[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
	public void writeIntLE(@OriginalArg(0) int value) {
		this.payload[this.position++] = (byte) value;
		this.payload[this.position++] = (byte) (value >> 8);
		this.payload[this.position++] = (byte) (value >> 16);
		this.payload[this.position++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)V")
	public void writeLongBE(@OriginalArg(1) long value) {
		this.payload[this.position++] = (byte) (value >> 56);
		this.payload[this.position++] = (byte) (value >> 48);
		this.payload[this.position++] = (byte) (value >> 40);
		this.payload[this.position++] = (byte) (value >> 32);
		this.payload[this.position++] = (byte) (value >> 24);
		this.payload[this.position++] = (byte) (value >> 16);
		this.payload[this.position++] = (byte) (value >> 8);
		this.payload[this.position++] = (byte) value;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void writeString(@OriginalArg(0) String string) {
		string.getBytes(0, string.length(), this.payload, this.position);
		this.position += string.length();
		this.payload[this.position++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BIZ)V")
	public void writeBytes(@OriginalArg(1) byte[] bytes, @OriginalArg(0) int offset, @OriginalArg(2) int length) {
		for (int pos = offset; pos < offset + length; pos++) {
			this.payload[this.position++] = bytes[pos];
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public void method497(@OriginalArg(0) int length) {
		this.payload[this.position - length - 1] = (byte) length;
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
	public int readMediumBE() {
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
	public byte[] getStringArray() {
		@Pc(2) int position = this.position;
		while (this.payload[this.position++] != 10);
		@Pc(29) byte[] local29 = new byte[this.position - position - 1];
		for (@Pc(31) int pos = position; pos < this.position - 1; pos++) {
			local29[pos - position] = this.payload[pos];
		}
		return local29;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[BI)V")
	public void readBytes(@OriginalArg(2) byte[] bytes, @OriginalArg(0) int start, @OriginalArg(3) int length) {
		for (@Pc(8) int pos = start; pos < start + length; pos++) {
			bytes[pos] = this.payload[this.position++];
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void initBitAccess(@OriginalArg(0) int arg0) {
		this.bitPosition = this.position * 8;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	public int readBits(@OriginalArg(1) int numBits) {
		@Pc(11) int local11 = this.bitPosition >> 3;
		@Pc(18) int local18 = 8 - (this.bitPosition & 0x7);
		@Pc(20) int vallue = 0;
		this.bitPosition += numBits;
		while (numBits > local18) {
			vallue += (this.payload[local11++] & Static21.anIntArray226[local18]) << numBits - local18;
			numBits -= local18;
			local18 = 8;
		}
		if (numBits == local18) {
			vallue += this.payload[local11] & Static21.anIntArray226[local18];
		} else {
			vallue += this.payload[local11] >> local18 - numBits & Static21.anIntArray226[numBits];
		}
		return vallue;
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public void finishBitAccess() {
		this.position = (this.bitPosition + 7) / 8;
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int readSmart() {
		@Pc(7) int value = this.payload[this.position] & 0xFF;
		return value < 128 ? this.readUByte() - 64 : this.readUShortLE() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int readUSmart() {
		@Pc(7) int local7 = this.payload[this.position] & 0xFF;
		return local7 < 128 ? this.readUByte() : this.readUShortLE() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void encrpyt(@OriginalArg(1) BigInteger key, @OriginalArg(2) BigInteger modulus) {
		@Pc(2) int length = this.position;
		this.position = 0;
		@Pc(8) byte[] bytes = new byte[length];
		this.readBytes(bytes, 0, length);
		@Pc(25) BigInteger exponent = new BigInteger(bytes);
		@Pc(30) BigInteger mod = exponent.modPow(key, modulus);

		@Pc(33) byte[] encrypted = mod.toByteArray();
		this.position = 0;
		this.method488(encrypted.length);
		this.writeBytes(encrypted, 0, encrypted.length);
	}
}
