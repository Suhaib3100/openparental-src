package androidx.compose.ui.text.font;

import androidx.compose.foundation.layout.f3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FontVariation.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\t\u001e\u0016\u000b\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J4\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001b\"\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/font/n0;", "", "<init>", "()V", "", "name", "", "value", "Landroidx/compose/ui/text/font/n0$a;", "a", "(Ljava/lang/String;F)Landroidx/compose/ui/text/font/n0$a;", "d", "(F)Landroidx/compose/ui/text/font/n0$a;", "Landroidx/compose/ui/unit/z;", "textSize", "e", "(J)Landroidx/compose/ui/text/font/n0$a;", "f", "h", "", "g", "(I)Landroidx/compose/ui/text/font/n0$a;", "c", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "", "settings", "Landroidx/compose/ui/text/font/n0$e;", "b", "(Landroidx/compose/ui/text/font/o0;I[Landroidx/compose/ui/text/font/n0$a;)Landroidx/compose/ui/text/font/n0$e;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final n0 f20791a = new n0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f20792b = 0;

    /* compiled from: FontVariation.kt */
    @androidx.compose.runtime.m1
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/n0$a;", "", "Landroidx/compose/ui/unit/d;", "density", "", "b", "(Landroidx/compose/ui/unit/d;)F", "", "a", "()Z", "needsDensity", "", "c", "()Ljava/lang/String;", "axisName", "Landroidx/compose/ui/text/font/n0$b;", "Landroidx/compose/ui/text/font/n0$c;", "Landroidx/compose/ui/text/font/n0$d;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        /* renamed from: a */
        boolean getNeedsDensity();

        float b(@fg.m androidx.compose.ui.unit.d density);

        @fg.l
        /* renamed from: c */
        String getAxisName();
    }

    /* compiled from: FontVariation.kt */
    @androidx.compose.runtime.m1
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/font/n0$b;", "Landroidx/compose/ui/text/font/n0$a;", "", "axisName", "", "value", "<init>", "(Ljava/lang/String;F)V", "Landroidx/compose/ui/unit/d;", "density", "b", "(Landroidx/compose/ui/unit/d;)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "F", "d", "()F", "Z", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String axisName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public b(@fg.l String str, float f4) {
            this.axisName = str;
            this.value = f4;
        }

        @Override // androidx.compose.ui.text.font.n0.a
        /* renamed from: a, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @Override // androidx.compose.ui.text.font.n0.a
        public float b(@fg.m androidx.compose.ui.unit.d density) {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.n0.a
        @fg.l
        /* renamed from: c, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        /* renamed from: d, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return kotlin.jvm.internal.l0.g(this.axisName, bVar.axisName) && this.value == bVar.value;
        }

        public int hashCode() {
            return Float.hashCode(this.value) + (this.axisName.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
            sb.append(this.axisName);
            sb.append("', value=");
            return androidx.compose.animation.b.a(sb, this.value, ')');
        }
    }

    /* compiled from: FontVariation.kt */
    @androidx.compose.runtime.m1
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/font/n0$c;", "Landroidx/compose/ui/text/font/n0$a;", "", "axisName", "", "value", "<init>", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/unit/d;", "density", "", "b", "(Landroidx/compose/ui/unit/d;)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "I", "d", "Z", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String axisName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public c(@fg.l String str, int i4) {
            this.axisName = str;
            this.value = i4;
        }

        @Override // androidx.compose.ui.text.font.n0.a
        /* renamed from: a, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @Override // androidx.compose.ui.text.font.n0.a
        public float b(@fg.m androidx.compose.ui.unit.d density) {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.n0.a
        @fg.l
        /* renamed from: c, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        /* renamed from: d, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return kotlin.jvm.internal.l0.g(this.axisName, cVar.axisName) && this.value == cVar.value;
        }

        public int hashCode() {
            return (this.axisName.hashCode() * 31) + this.value;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
            sb.append(this.axisName);
            sb.append("', value=");
            return androidx.view.e.a(sb, this.value, ')');
        }
    }

    /* compiled from: FontVariation.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/font/n0$d;", "Landroidx/compose/ui/text/font/n0$a;", "", "axisName", "Landroidx/compose/ui/unit/z;", "value", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "density", "", "b", "(Landroidx/compose/ui/unit/d;)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "J", "d", "()J", "Z", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.m1
    @kotlin.jvm.internal.r1({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
    private static final class d implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String axisName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public /* synthetic */ d(String str, long j4, kotlin.jvm.internal.w wVar) {
            this(str, j4);
        }

        @Override // androidx.compose.ui.text.font.n0.a
        /* renamed from: a, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @Override // androidx.compose.ui.text.font.n0.a
        public float b(@fg.m androidx.compose.ui.unit.d density) {
            if (density == null) {
                throw new IllegalArgumentException("density must not be null");
            }
            return density.getFontScale() * androidx.compose.ui.unit.z.n(this.value);
        }

        @Override // androidx.compose.ui.text.font.n0.a
        @fg.l
        /* renamed from: c, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        /* renamed from: d, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return kotlin.jvm.internal.l0.g(this.axisName, dVar.axisName) && androidx.compose.ui.unit.z.j(this.value, dVar.value);
        }

        public int hashCode() {
            return androidx.compose.ui.unit.z.o(this.value) + (this.axisName.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            return "FontVariation.Setting(axisName='" + this.axisName + "', value=" + ((Object) androidx.compose.ui.unit.z.u(this.value)) + ')';
        }

        private d(String str, long j4) {
            this.axisName = str;
            this.value = j4;
            this.needsDensity = true;
        }
    }

    /* compiled from: FontVariation.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/n0$e;", "", "", "Landroidx/compose/ui/text/font/n0$a;", "settings", "<init>", "([Landroidx/compose/ui/text/font/n0$a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.m1
    @kotlin.jvm.internal.r1({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n10783#2:374\n11008#2,3:375\n11011#2,3:385\n361#3,7:378\n76#4:388\n96#4,5:389\n101#5,2:394\n33#5,6:396\n103#5:402\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:374\n52#1:375,3\n52#1:385,3\n52#1:378,7\n53#1:388\n53#1:389,5\n60#1:394,2\n60#1:396,6\n60#1:402\n*E\n"})
    public static final class e {

        /* renamed from: c, reason: collision with root package name */
        public static final int f20802c = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<a> settings;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public e(@fg.l a... aVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z4 = false;
            for (a aVar : aVarArr) {
                String axisName = aVar.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(aVar);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(f3.a(androidx.appcompat.view.g.a("'", str, "' must be unique. Actual [ ["), kotlin.collections.w.m3(list, null, null, null, 0, null, null, 63, null), ']').toString());
                }
                kotlin.collections.w.q0(arrayList, list);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.settings = arrayList2;
            int size = arrayList2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                if (((a) arrayList2.get(i4)).getNeedsDensity()) {
                    z4 = true;
                    break;
                }
                i4++;
            }
            this.needsDensity = z4;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @fg.l
        public final List<a> b() {
            return this.settings;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && kotlin.jvm.internal.l0.g(this.settings, ((e) other).settings);
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private n0() {
    }

    @fg.l
    public final a a(@fg.l String name, float value) {
        if (name.length() == 4) {
            return new b(name, value);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + name + '\'').toString());
    }

    @fg.l
    public final e b(@fg.l o0 weight, int style, @fg.l a... settings) {
        kotlin.jvm.internal.s1 s1Var = new kotlin.jvm.internal.s1(3);
        s1Var.a(g(weight.u()));
        s1Var.a(d(style));
        s1Var.b(settings);
        return new e((a[]) s1Var.d(new a[s1Var.c()]));
    }

    @fg.l
    public final a c(int value) {
        if (-1000 > value || value >= 1001) {
            throw new IllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new c("GRAD", value);
    }

    @fg.l
    public final a d(float value) {
        if (0.0f <= value && value <= 1.0f) {
            return new b("ital", value);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + value).toString());
    }

    @fg.l
    public final a e(long textSize) {
        if (androidx.compose.ui.unit.z.q(textSize)) {
            return new d("opsz", textSize, null);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units");
    }

    @fg.l
    public final a f(float value) {
        if (-90.0f <= value && value <= 90.0f) {
            return new b("slnt", value);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + value).toString());
    }

    @fg.l
    public final a g(int value) {
        if (1 > value || value >= 1001) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("'wght' value must be in [1, 1000]. Actual: ", value).toString());
        }
        return new c("wght", value);
    }

    @fg.l
    public final a h(float value) {
        if (value > 0.0f) {
            return new b("wdth", value);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + value).toString());
    }
}
