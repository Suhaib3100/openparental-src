package c4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.ranges.IntRange;
import p3.f;

/* compiled from: BuiltInsBinaryVersion.kt */
/* loaded from: classes5.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    /* renamed from: g, reason: collision with root package name */
    @d
    public static final C0130a f10673g = new C0130a(null);

    /* renamed from: h, reason: collision with root package name */
    @d
    @f
    public static final a f10674h = new a(1, 0, 7);

    /* renamed from: i, reason: collision with root package name */
    @d
    @f
    public static final a f10675i = new a(new int[0]);

    /* compiled from: BuiltInsBinaryVersion.kt */
    /* renamed from: c4.a$a, reason: collision with other inner class name */
    public static final class C0130a {
        private C0130a() {
        }

        @d
        public final a a(@d InputStream inputStream) {
            int b02;
            int[] U5;
            l0.p(inputStream, ProtectedSandApp.s("㎜"));
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            b02 = b0.b0(intRange, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            U5 = j0.U5(arrayList);
            return new a(Arrays.copyOf(U5, U5.length));
        }

        public C0130a(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        l0.p(iArr, ProtectedSandApp.s("㎣"));
    }

    public boolean h() {
        return f(f10674h);
    }
}
