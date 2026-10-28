package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.room.t2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Data.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f35968b = s.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final f f35969c = new a().a();

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f35970d = 10240;

    /* renamed from: a, reason: collision with root package name */
    Map<String, Object> f35971a;

    /* compiled from: Data.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, Object> f35972a = new HashMap();

        @o0
        public f a() {
            f fVar = new f((Map<String, ?>) this.f35972a);
            f.F(fVar);
            return fVar;
        }

        @c1({c1.a.LIBRARY_GROUP})
        @o0
        public a b(@o0 String key, @q0 Object value) {
            if (value == null) {
                this.f35972a.put(key, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f35972a.put(key, value);
                } else if (cls == boolean[].class) {
                    this.f35972a.put(key, f.a((boolean[]) value));
                } else if (cls == byte[].class) {
                    this.f35972a.put(key, f.b((byte[]) value));
                } else if (cls == int[].class) {
                    this.f35972a.put(key, f.e((int[]) value));
                } else if (cls == long[].class) {
                    this.f35972a.put(key, f.f((long[]) value));
                } else if (cls == float[].class) {
                    this.f35972a.put(key, f.d((float[]) value));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                    }
                    this.f35972a.put(key, f.c((double[]) value));
                }
            }
            return this;
        }

        @o0
        public a c(@o0 f data) {
            d(data.f35971a);
            return this;
        }

        @o0
        public a d(@o0 Map<String, Object> values) {
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @o0
        public a e(@o0 String key, boolean value) {
            this.f35972a.put(key, Boolean.valueOf(value));
            return this;
        }

        @o0
        public a f(@o0 String key, @o0 boolean[] value) {
            this.f35972a.put(key, f.a(value));
            return this;
        }

        @o0
        public a g(@o0 String key, byte value) {
            this.f35972a.put(key, Byte.valueOf(value));
            return this;
        }

        @o0
        public a h(@o0 String key, @o0 byte[] value) {
            this.f35972a.put(key, f.b(value));
            return this;
        }

        @o0
        public a i(@o0 String key, double value) {
            this.f35972a.put(key, Double.valueOf(value));
            return this;
        }

        @o0
        public a j(@o0 String key, @o0 double[] value) {
            this.f35972a.put(key, f.c(value));
            return this;
        }

        @o0
        public a k(@o0 String key, float value) {
            this.f35972a.put(key, Float.valueOf(value));
            return this;
        }

        @o0
        public a l(@o0 String key, @o0 float[] value) {
            this.f35972a.put(key, f.d(value));
            return this;
        }

        @o0
        public a m(@o0 String key, int value) {
            this.f35972a.put(key, Integer.valueOf(value));
            return this;
        }

        @o0
        public a n(@o0 String key, @o0 int[] value) {
            this.f35972a.put(key, f.e(value));
            return this;
        }

        @o0
        public a o(@o0 String key, long value) {
            this.f35972a.put(key, Long.valueOf(value));
            return this;
        }

        @o0
        public a p(@o0 String key, @o0 long[] value) {
            this.f35972a.put(key, f.f(value));
            return this;
        }

        @o0
        public a q(@o0 String key, @q0 String value) {
            this.f35972a.put(key, value);
            return this;
        }

        @o0
        public a r(@o0 String key, @o0 String[] value) {
            this.f35972a.put(key, value);
            return this;
        }
    }

    f() {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    @t2
    public static byte[] F(@o0 f data) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            objectOutputStream.writeInt(data.f35971a.size());
            for (Map.Entry<String, Object> entry : data.f35971a.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException unused2) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException unused4) {
            objectOutputStream2 = objectOutputStream;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused6) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused7) {
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException unused8) {
                throw th;
            }
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static Boolean[] a(@o0 boolean[] value) {
        Boolean[] boolArr = new Boolean[value.length];
        for (int i4 = 0; i4 < value.length; i4++) {
            boolArr[i4] = Boolean.valueOf(value[i4]);
        }
        return boolArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static Byte[] b(@o0 byte[] value) {
        Byte[] bArr = new Byte[value.length];
        for (int i4 = 0; i4 < value.length; i4++) {
            bArr[i4] = Byte.valueOf(value[i4]);
        }
        return bArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static Double[] c(@o0 double[] value) {
        Double[] dArr = new Double[value.length];
        for (int i4 = 0; i4 < value.length; i4++) {
            dArr[i4] = Double.valueOf(value[i4]);
        }
        return dArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static Float[] d(@o0 float[] value) {
        Float[] fArr = new Float[value.length];
        for (int i4 = 0; i4 < value.length; i4++) {
            fArr[i4] = Float.valueOf(value[i4]);
        }
        return fArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static Integer[] e(@o0 int[] value) {
        Integer[] numArr = new Integer[value.length];
        for (int i4 = 0; i4 < value.length; i4++) {
            numArr[i4] = Integer.valueOf(value[i4]);
        }
        return numArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static Long[] f(@o0 long[] value) {
        Long[] lArr = new Long[value.length];
        for (int i4 = 0; i4 < value.length; i4++) {
            lArr[i4] = Long.valueOf(value[i4]);
        }
        return lArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static byte[] g(@o0 Byte[] array) {
        byte[] bArr = new byte[array.length];
        for (int i4 = 0; i4 < array.length; i4++) {
            bArr[i4] = array[i4].byteValue();
        }
        return bArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static double[] h(@o0 Double[] array) {
        double[] dArr = new double[array.length];
        for (int i4 = 0; i4 < array.length; i4++) {
            dArr[i4] = array[i4].doubleValue();
        }
        return dArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static float[] i(@o0 Float[] array) {
        float[] fArr = new float[array.length];
        for (int i4 = 0; i4 < array.length; i4++) {
            fArr[i4] = array[i4].floatValue();
        }
        return fArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static int[] j(@o0 Integer[] array) {
        int[] iArr = new int[array.length];
        for (int i4 = 0; i4 < array.length; i4++) {
            iArr[i4] = array[i4].intValue();
        }
        return iArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static long[] k(@o0 Long[] array) {
        long[] jArr = new long[array.length];
        for (int i4 = 0; i4 < array.length; i4++) {
            jArr[i4] = array[i4].longValue();
        }
        return jArr;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public static boolean[] l(@o0 Boolean[] array) {
        boolean[] zArr = new boolean[array.length];
        for (int i4 = 0; i4 < array.length; i4++) {
            zArr[i4] = array[i4].booleanValue();
        }
        return zArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x0030
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @androidx.annotation.o0
    @androidx.room.t2
    public static androidx.work.f m(@androidx.annotation.o0 byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L4c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            int r5 = r2.readInt()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L19:
            if (r5 <= 0) goto L2d
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            goto L19
        L29:
            r5 = move-exception
            goto L37
        L2b:
            r5 = r2
            goto L40
        L2d:
            r2.close()     // Catch: java.io.IOException -> L30
        L30:
            r1.close()     // Catch: java.io.IOException -> L46
            goto L46
        L34:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L37:
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r1.close()     // Catch: java.io.IOException -> L3f
        L3f:
            throw r5
        L40:
            if (r5 == 0) goto L30
            r5.close()     // Catch: java.io.IOException -> L30
            goto L30
        L46:
            androidx.work.f r5 = new androidx.work.f
            r5.<init>(r0)
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.f.m(byte[]):androidx.work.f");
    }

    @q0
    public String A(@o0 String key) {
        Object obj = this.f35971a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @q0
    public String[] B(@o0 String key) {
        Object obj = this.f35971a.get(key);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean C(@o0 String key, @o0 Class<T> klass) {
        Object obj = this.f35971a.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    @c1({c1.a.LIBRARY_GROUP})
    @m1
    public int D() {
        return this.f35971a.size();
    }

    @o0
    public byte[] E() {
        return F(this);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (o4 == null || f.class != o4.getClass()) {
            return false;
        }
        f fVar = (f) o4;
        Set<String> keySet = this.f35971a.keySet();
        if (!keySet.equals(fVar.f35971a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj = this.f35971a.get(str);
            Object obj2 = fVar.f35971a.get(str);
            if (!((obj == null || obj2 == null) ? obj == obj2 : ((obj instanceof Object[]) && (obj2 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj, (Object[]) obj2) : obj.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f35971a.hashCode() * 31;
    }

    public boolean n(@o0 String key, boolean defaultValue) {
        Object obj = this.f35971a.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    @q0
    public boolean[] o(@o0 String key) {
        Object obj = this.f35971a.get(key);
        if (obj instanceof Boolean[]) {
            return l((Boolean[]) obj);
        }
        return null;
    }

    public byte p(@o0 String key, byte defaultValue) {
        Object obj = this.f35971a.get(key);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : defaultValue;
    }

    @q0
    public byte[] q(@o0 String key) {
        Object obj = this.f35971a.get(key);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public double r(@o0 String key, double defaultValue) {
        Object obj = this.f35971a.get(key);
        return obj instanceof Double ? ((Double) obj).doubleValue() : defaultValue;
    }

    @q0
    public double[] s(@o0 String key) {
        Object obj = this.f35971a.get(key);
        if (obj instanceof Double[]) {
            return h((Double[]) obj);
        }
        return null;
    }

    public float t(@o0 String key, float defaultValue) {
        Object obj = this.f35971a.get(key);
        return obj instanceof Float ? ((Float) obj).floatValue() : defaultValue;
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f35971a.isEmpty()) {
            for (String str : this.f35971a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f35971a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @q0
    public float[] u(@o0 String key) {
        Object obj = this.f35971a.get(key);
        if (obj instanceof Float[]) {
            return i((Float[]) obj);
        }
        return null;
    }

    public int v(@o0 String key, int defaultValue) {
        Object obj = this.f35971a.get(key);
        return obj instanceof Integer ? ((Integer) obj).intValue() : defaultValue;
    }

    @q0
    public int[] w(@o0 String key) {
        Object obj = this.f35971a.get(key);
        if (obj instanceof Integer[]) {
            return j((Integer[]) obj);
        }
        return null;
    }

    @o0
    public Map<String, Object> x() {
        return Collections.unmodifiableMap(this.f35971a);
    }

    public long y(@o0 String key, long defaultValue) {
        Object obj = this.f35971a.get(key);
        return obj instanceof Long ? ((Long) obj).longValue() : defaultValue;
    }

    @q0
    public long[] z(@o0 String key) {
        Object obj = this.f35971a.get(key);
        if (obj instanceof Long[]) {
            return k((Long[]) obj);
        }
        return null;
    }

    public f(@o0 f other) {
        this.f35971a = new HashMap(other.f35971a);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public f(@o0 Map<String, ?> values) {
        this.f35971a = new HashMap(values);
    }
}
