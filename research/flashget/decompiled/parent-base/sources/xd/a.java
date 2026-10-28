package xd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kd.f;
import kotlin.collections.u0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: BuiltInsBinaryVersion.kt */
/* loaded from: classes8.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    /* renamed from: g, reason: collision with root package name */
    @l
    public static final C1406a f92951g = new C1406a();

    /* renamed from: h, reason: collision with root package name */
    @l
    @f
    public static final a f92952h = new a(1, 0, 7);

    /* renamed from: i, reason: collision with root package name */
    @l
    @f
    public static final a f92953i = new a(new int[0]);

    /* compiled from: BuiltInsBinaryVersion.kt */
    @r1({"SMAP\nBuiltInsBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsBinaryVersion.kt\norg/jetbrains/kotlin/metadata/builtins/BuiltInsBinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1549#2:41\n1620#2,3:42\n*S KotlinDebug\n*F\n+ 1 BuiltInsBinaryVersion.kt\norg/jetbrains/kotlin/metadata/builtins/BuiltInsBinaryVersion$Companion\n*L\n36#1:41\n36#1:42,3\n*E\n"})
    /* renamed from: xd.a$a, reason: collision with other inner class name */
    public static final class C1406a {
        private C1406a() {
        }

        @l
        public final a a(@l InputStream inputStream) {
            l0.p(inputStream, ProtectedSandApp.s("ꍉ\u0001"));
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            kotlin.ranges.l lVar = new kotlin.ranges.l(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(w.b0(lVar, 10));
            Iterator<Integer> it = lVar.iterator();
            while (it.hasNext()) {
                ((u0) it).c();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] U5 = w.U5(arrayList);
            return new a(Arrays.copyOf(U5, U5.length));
        }

        public C1406a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@l int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        l0.p(iArr, ProtectedSandApp.s("ꍊ\u0001"));
    }

    public boolean h() {
        return f(f92952h);
    }
}
