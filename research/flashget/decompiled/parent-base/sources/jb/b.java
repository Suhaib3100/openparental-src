package jb;

import androidx.collection.n1;
import androidx.compose.ui.graphics.colorspace.c0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: NtpPacket.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0012\u001d\u001eBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0088\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b.\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b/\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b0\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b1\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b2\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b4\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b5\u0010\u001aR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b6\u0010\u001aR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\b7\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b8\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b9\u0010\u001a¨\u0006:"}, d2 = {"Ljb/b;", "", "", "warningLeapSecond", "protocolVersion", "protocolMode", "stratum", "maximumPollIntervalPowerOfTwo", "precisionPowerOfTwo", "", "rootDelaySeconds", "rootDispersionSeconds", "referenceTimeSecondsSince1900", "originateTimeSecondsSince1900", "receiveTimeSecondsSince1900", "transmitTimeSecondsSince1900", "<init>", "(BBBBBBDDDDDD)V", "a", "()B", "e", "f", "g", "h", "i", "j", "()D", "k", "l", "b", "c", "d", "m", "(BBBBBBDDDDDD)Ljb/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "B", "z", "s", "r", "x", "o", "q", "D", "v", "w", "u", "p", "t", "y", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte warningLeapSecond;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final byte protocolVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte protocolMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final byte stratum;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final byte maximumPollIntervalPowerOfTwo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final byte precisionPowerOfTwo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final double rootDelaySeconds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final double rootDispersionSeconds;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final double referenceTimeSecondsSince1900;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final double originateTimeSecondsSince1900;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final double receiveTimeSecondsSince1900;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final double transmitTimeSecondsSince1900;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NtpPacket.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Ljb/b$a;", "", "", "value", "<init>", "(Ljava/lang/String;IB)V", "B", "getValue", "()B", "Reserved", "SymmetricActive", "SymmetricPassive", "Client", "Server", "Broadcast", "ReservedNtp", "ReservedPrivate", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final byte value;
        public static final a Reserved = new a(ProtectedSandApp.s("㠬\u0001"), 0, (byte) 0);
        public static final a SymmetricActive = new a(ProtectedSandApp.s("㠭\u0001"), 1, (byte) 1);
        public static final a SymmetricPassive = new a(ProtectedSandApp.s("㠮\u0001"), 2, (byte) 2);
        public static final a Client = new a(ProtectedSandApp.s("㠯\u0001"), 3, (byte) 3);
        public static final a Server = new a(ProtectedSandApp.s("㠰\u0001"), 4, (byte) 4);
        public static final a Broadcast = new a(ProtectedSandApp.s("㠱\u0001"), 5, (byte) 5);
        public static final a ReservedNtp = new a(ProtectedSandApp.s("㠲\u0001"), 6, (byte) 6);
        public static final a ReservedPrivate = new a(ProtectedSandApp.s("㠳\u0001"), 7, (byte) 7);

        private static final /* synthetic */ a[] $values() {
            return new a[]{Reserved, SymmetricActive, SymmetricPassive, Client, Server, Broadcast, ReservedNtp, ReservedPrivate};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private a(String str, int i4, byte b5) {
            this.value = b5;
        }

        @l
        public static kotlin.enums.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final byte getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NtpPacket.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Ljb/b$b;", "", "", "valueFrom", "valueTill", "<init>", "(Ljava/lang/String;IBB)V", "B", "getValueFrom", "()B", "getValueTill", "KissOfDeath", "PrimaryReference", "SecondaryReference", "Reserved", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jb.b$b, reason: collision with other inner class name */
    public static final class EnumC1037b {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EnumC1037b[] $VALUES;
        private final byte valueFrom;
        private final byte valueTill;
        public static final EnumC1037b KissOfDeath = new EnumC1037b(ProtectedSandApp.s("㠴\u0001"), 0, (byte) 0, (byte) 0);
        public static final EnumC1037b PrimaryReference = new EnumC1037b(ProtectedSandApp.s("㠵\u0001"), 1, (byte) 1, (byte) 1);
        public static final EnumC1037b SecondaryReference = new EnumC1037b(ProtectedSandApp.s("㠶\u0001"), 2, (byte) 2, com.google.common.base.c.C);
        public static final EnumC1037b Reserved = new EnumC1037b(ProtectedSandApp.s("㠷\u0001"), 3, com.google.common.base.c.f54872r, Byte.MAX_VALUE);

        private static final /* synthetic */ EnumC1037b[] $values() {
            return new EnumC1037b[]{KissOfDeath, PrimaryReference, SecondaryReference, Reserved};
        }

        static {
            EnumC1037b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private EnumC1037b(String str, int i4, byte b5, byte b6) {
            this.valueFrom = b5;
            this.valueTill = b6;
        }

        @l
        public static kotlin.enums.a<EnumC1037b> getEntries() {
            return $ENTRIES;
        }

        public static EnumC1037b valueOf(String str) {
            return (EnumC1037b) Enum.valueOf(EnumC1037b.class, str);
        }

        public static EnumC1037b[] values() {
            return (EnumC1037b[]) $VALUES.clone();
        }

        public final byte getValueFrom() {
            return this.valueFrom;
        }

        public final byte getValueTill() {
            return this.valueTill;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NtpPacket.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ljb/b$c;", "", "", "value", "<init>", "(Ljava/lang/String;IB)V", "B", "getValue", "()B", "NoWarning", "WarningLastMinuteHas61Seconds", "WarningLastMinuteHas59Seconds", "AlertClockUnsynchronized", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final byte value;
        public static final c NoWarning = new c(ProtectedSandApp.s("㠸\u0001"), 0, (byte) 0);
        public static final c WarningLastMinuteHas61Seconds = new c(ProtectedSandApp.s("㠹\u0001"), 1, (byte) 1);
        public static final c WarningLastMinuteHas59Seconds = new c(ProtectedSandApp.s("㠺\u0001"), 2, (byte) 2);
        public static final c AlertClockUnsynchronized = new c(ProtectedSandApp.s("㠻\u0001"), 3, (byte) 3);

        private static final /* synthetic */ c[] $values() {
            return new c[]{NoWarning, WarningLastMinuteHas61Seconds, WarningLastMinuteHas59Seconds, AlertClockUnsynchronized};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private c(String str, int i4, byte b5) {
            this.value = b5;
        }

        @l
        public static kotlin.enums.a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final byte getValue() {
            return this.value;
        }
    }

    public b(byte b5, byte b6, byte b7, byte b10, byte b11, byte b12, double d5, double d6, double d7, double d10, double d11, double d12) {
        this.warningLeapSecond = b5;
        this.protocolVersion = b6;
        this.protocolMode = b7;
        this.stratum = b10;
        this.maximumPollIntervalPowerOfTwo = b11;
        this.precisionPowerOfTwo = b12;
        this.rootDelaySeconds = d5;
        this.rootDispersionSeconds = d6;
        this.referenceTimeSecondsSince1900 = d7;
        this.originateTimeSecondsSince1900 = d10;
        this.receiveTimeSecondsSince1900 = d11;
        this.transmitTimeSecondsSince1900 = d12;
    }

    public static b n(b bVar, byte b5, byte b6, byte b7, byte b10, byte b11, byte b12, double d5, double d6, double d7, double d10, double d11, double d12, int i4, Object obj) {
        byte b13 = (i4 & 1) != 0 ? bVar.warningLeapSecond : b5;
        byte b14 = (i4 & 2) != 0 ? bVar.protocolVersion : b6;
        byte b15 = (i4 & 4) != 0 ? bVar.protocolMode : b7;
        byte b16 = (i4 & 8) != 0 ? bVar.stratum : b10;
        byte b17 = (i4 & 16) != 0 ? bVar.maximumPollIntervalPowerOfTwo : b11;
        byte b18 = (i4 & 32) != 0 ? bVar.precisionPowerOfTwo : b12;
        double d13 = (i4 & 64) != 0 ? bVar.rootDelaySeconds : d5;
        double d14 = (i4 & 128) != 0 ? bVar.rootDispersionSeconds : d6;
        double d15 = (i4 & 256) != 0 ? bVar.referenceTimeSecondsSince1900 : d7;
        double d16 = (i4 & 512) != 0 ? bVar.originateTimeSecondsSince1900 : d10;
        double d17 = (i4 & 1024) != 0 ? bVar.receiveTimeSecondsSince1900 : d11;
        double d18 = (i4 & 2048) != 0 ? bVar.transmitTimeSecondsSince1900 : d12;
        bVar.getClass();
        return new b(b13, b14, b15, b16, b17, b18, d13, d14, d15, d16, d17, d18);
    }

    /* renamed from: a, reason: from getter */
    public final byte getWarningLeapSecond() {
        return this.warningLeapSecond;
    }

    /* renamed from: b, reason: from getter */
    public final double getOriginateTimeSecondsSince1900() {
        return this.originateTimeSecondsSince1900;
    }

    /* renamed from: c, reason: from getter */
    public final double getReceiveTimeSecondsSince1900() {
        return this.receiveTimeSecondsSince1900;
    }

    /* renamed from: d, reason: from getter */
    public final double getTransmitTimeSecondsSince1900() {
        return this.transmitTimeSecondsSince1900;
    }

    /* renamed from: e, reason: from getter */
    public final byte getProtocolVersion() {
        return this.protocolVersion;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return this.warningLeapSecond == bVar.warningLeapSecond && this.protocolVersion == bVar.protocolVersion && this.protocolMode == bVar.protocolMode && this.stratum == bVar.stratum && this.maximumPollIntervalPowerOfTwo == bVar.maximumPollIntervalPowerOfTwo && this.precisionPowerOfTwo == bVar.precisionPowerOfTwo && Double.compare(this.rootDelaySeconds, bVar.rootDelaySeconds) == 0 && Double.compare(this.rootDispersionSeconds, bVar.rootDispersionSeconds) == 0 && Double.compare(this.referenceTimeSecondsSince1900, bVar.referenceTimeSecondsSince1900) == 0 && Double.compare(this.originateTimeSecondsSince1900, bVar.originateTimeSecondsSince1900) == 0 && Double.compare(this.receiveTimeSecondsSince1900, bVar.receiveTimeSecondsSince1900) == 0 && Double.compare(this.transmitTimeSecondsSince1900, bVar.transmitTimeSecondsSince1900) == 0;
    }

    /* renamed from: f, reason: from getter */
    public final byte getProtocolMode() {
        return this.protocolMode;
    }

    /* renamed from: g, reason: from getter */
    public final byte getStratum() {
        return this.stratum;
    }

    /* renamed from: h, reason: from getter */
    public final byte getMaximumPollIntervalPowerOfTwo() {
        return this.maximumPollIntervalPowerOfTwo;
    }

    public int hashCode() {
        return Double.hashCode(this.transmitTimeSecondsSince1900) + c0.a(this.receiveTimeSecondsSince1900, c0.a(this.originateTimeSecondsSince1900, c0.a(this.referenceTimeSecondsSince1900, c0.a(this.rootDispersionSeconds, c0.a(this.rootDelaySeconds, (Byte.hashCode(this.precisionPowerOfTwo) + ((Byte.hashCode(this.maximumPollIntervalPowerOfTwo) + ((Byte.hashCode(this.stratum) + ((Byte.hashCode(this.protocolMode) + ((Byte.hashCode(this.protocolVersion) + (Byte.hashCode(this.warningLeapSecond) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final byte getPrecisionPowerOfTwo() {
        return this.precisionPowerOfTwo;
    }

    /* renamed from: j, reason: from getter */
    public final double getRootDelaySeconds() {
        return this.rootDelaySeconds;
    }

    /* renamed from: k, reason: from getter */
    public final double getRootDispersionSeconds() {
        return this.rootDispersionSeconds;
    }

    /* renamed from: l, reason: from getter */
    public final double getReferenceTimeSecondsSince1900() {
        return this.referenceTimeSecondsSince1900;
    }

    @l
    public final b m(byte warningLeapSecond, byte protocolVersion, byte protocolMode, byte stratum, byte maximumPollIntervalPowerOfTwo, byte precisionPowerOfTwo, double rootDelaySeconds, double rootDispersionSeconds, double referenceTimeSecondsSince1900, double originateTimeSecondsSince1900, double receiveTimeSecondsSince1900, double transmitTimeSecondsSince1900) {
        return new b(warningLeapSecond, protocolVersion, protocolMode, stratum, maximumPollIntervalPowerOfTwo, precisionPowerOfTwo, rootDelaySeconds, rootDispersionSeconds, referenceTimeSecondsSince1900, originateTimeSecondsSince1900, receiveTimeSecondsSince1900, transmitTimeSecondsSince1900);
    }

    public final byte o() {
        return this.maximumPollIntervalPowerOfTwo;
    }

    public final double p() {
        return this.originateTimeSecondsSince1900;
    }

    public final byte q() {
        return this.precisionPowerOfTwo;
    }

    public final byte r() {
        return this.protocolMode;
    }

    public final byte s() {
        return this.protocolVersion;
    }

    public final double t() {
        return this.receiveTimeSecondsSince1900;
    }

    @l
    public String toString() {
        byte b5 = this.warningLeapSecond;
        byte b6 = this.protocolVersion;
        byte b7 = this.protocolMode;
        byte b10 = this.stratum;
        byte b11 = this.maximumPollIntervalPowerOfTwo;
        byte b12 = this.precisionPowerOfTwo;
        double d5 = this.rootDelaySeconds;
        double d6 = this.rootDispersionSeconds;
        double d7 = this.referenceTimeSecondsSince1900;
        double d10 = this.originateTimeSecondsSince1900;
        double d11 = this.receiveTimeSecondsSince1900;
        double d12 = this.transmitTimeSecondsSince1900;
        StringBuilder a5 = n1.a(ProtectedSandApp.s("㠼\u0001"), b5, ProtectedSandApp.s("㠽\u0001"), b6, ProtectedSandApp.s("㠾\u0001"));
        androidx.paging.l.a(a5, b7, ProtectedSandApp.s("㠿\u0001"), b10, ProtectedSandApp.s("㡀\u0001"));
        androidx.paging.l.a(a5, b11, ProtectedSandApp.s("㡁\u0001"), b12, ProtectedSandApp.s("㡂\u0001"));
        a5.append(d5);
        a5.append(ProtectedSandApp.s("㡃\u0001"));
        a5.append(d6);
        a5.append(ProtectedSandApp.s("㡄\u0001"));
        a5.append(d7);
        a5.append(ProtectedSandApp.s("㡅\u0001"));
        a5.append(d10);
        a5.append(ProtectedSandApp.s("㡆\u0001"));
        a5.append(d11);
        a5.append(ProtectedSandApp.s("㡇\u0001"));
        a5.append(d12);
        a5.append(ProtectedSandApp.s("㡈\u0001"));
        return a5.toString();
    }

    public final double u() {
        return this.referenceTimeSecondsSince1900;
    }

    public final double v() {
        return this.rootDelaySeconds;
    }

    public final double w() {
        return this.rootDispersionSeconds;
    }

    public final byte x() {
        return this.stratum;
    }

    public final double y() {
        return this.transmitTimeSecondsSince1900;
    }

    public final byte z() {
        return this.warningLeapSecond;
    }
}
