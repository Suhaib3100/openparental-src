package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.appcompat.view.g;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

/* compiled from: MultiDex.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    private static final int f30955e = 20;

    /* renamed from: f, reason: collision with root package name */
    private static final int f30956f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f30957g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f30958h = 1;

    /* renamed from: a, reason: collision with root package name */
    static final String f30951a = "MultiDex";

    /* renamed from: b, reason: collision with root package name */
    private static final String f30952b = "secondary-dexes";

    /* renamed from: c, reason: collision with root package name */
    private static final String f30953c = "code_cache";

    /* renamed from: d, reason: collision with root package name */
    private static final String f30954d = "secondary-dexes";

    /* renamed from: i, reason: collision with root package name */
    private static final String f30959i = "";

    /* renamed from: j, reason: collision with root package name */
    private static final Set<File> f30960j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f30961k = o(System.getProperty("java.vm.version"));

    /* compiled from: MultiDex.java */
    private static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static final int f30962b = 4;

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0512a f30963a;

        /* compiled from: MultiDex.java */
        /* renamed from: androidx.multidex.b$a$a, reason: collision with other inner class name */
        private interface InterfaceC0512a {
            Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* compiled from: MultiDex.java */
        /* renamed from: androidx.multidex.b$a$b, reason: collision with other inner class name */
        private static class C0513b implements InterfaceC0512a {

            /* renamed from: a, reason: collision with root package name */
            private final Constructor<?> f30964a;

            C0513b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.f30964a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0512a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.f30964a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* compiled from: MultiDex.java */
        private static class c implements InterfaceC0512a {

            /* renamed from: a, reason: collision with root package name */
            private final Constructor<?> f30965a;

            c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.f30965a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0512a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f30965a.newInstance(file, file, dexFile);
            }
        }

        /* compiled from: MultiDex.java */
        private static class d implements InterfaceC0512a {

            /* renamed from: a, reason: collision with root package name */
            private final Constructor<?> f30966a;

            d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.f30966a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0512a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f30966a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private a() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
            InterfaceC0512a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new C0513b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new d(cls);
            }
            this.f30963a = dVar;
        }

        static void a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = b.g(classLoader, "pathList").get(classLoader);
            Object[] b5 = new a().b(list);
            try {
                b.f(obj, "dexElements", b5);
            } catch (NoSuchFieldException unused) {
                b.f(obj, "pathElements", b5);
            }
        }

        private Object[] b(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i4 = 0; i4 < size; i4++) {
                File file = list.get(i4);
                objArr[i4] = this.f30963a.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
            }
            return objArr;
        }

        private static String c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f30962b) + ".dex").getPath();
        }
    }

    /* compiled from: MultiDex.java */
    /* renamed from: androidx.multidex.b$b, reason: collision with other inner class name */
    private static final class C0514b {
        private C0514b() {
        }

        static void a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = b.g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            b.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                }
                Field g4 = b.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) g4.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                g4.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) b.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* compiled from: MultiDex.java */
    private static final class c {
        private c() {
        }

        static void a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field g4 = b.g(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) g4.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new ZipFile(next);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            g4.set(classLoader, sb.toString());
            b.f(classLoader, "mPaths", strArr);
            b.f(classLoader, "mFiles", fileArr);
            b.f(classLoader, "mZips", zipFileArr);
            b.f(classLoader, "mDexs", dexFileArr);
        }
    }

    private b() {
    }

    private static void d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : listFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void e(Context context, File file, File file2, String str, String str2, boolean z4) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
        Set<File> set = f30960j;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                System.getProperty("java.vm.version");
                ClassLoader j4 = j(context);
                if (j4 == null) {
                    return;
                }
                try {
                    d(context);
                } catch (Throwable unused) {
                }
                File k4 = k(context, file2, str);
                d dVar = new d(file, k4);
                try {
                    try {
                        n(j4, k4, dVar.h(context, str2, false));
                    } catch (IOException e4) {
                        if (!z4) {
                            throw e4;
                        }
                        n(j4, k4, dVar.h(context, str2, true));
                    }
                    try {
                        e = null;
                    } catch (IOException e5) {
                        e = e5;
                    }
                    if (e != null) {
                        throw e;
                    }
                } finally {
                    try {
                        dVar.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field g4 = g(obj, str);
        Object[] objArr2 = (Object[]) g4.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g4.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder a5 = g.a("Field ", str, " not found in ");
        a5.append(obj.getClass());
        throw new NoSuchFieldException(a5.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder a5 = g.a("Method ", str, " with parameters ");
        a5.append(Arrays.asList(clsArr));
        a5.append(" not found in ");
        a5.append(obj.getClass());
        throw new NoSuchMethodException(a5.toString());
    }

    private static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static ClassLoader j(Context context) {
        ClassLoader classLoader;
        try {
            classLoader = context.getClassLoader();
        } catch (RuntimeException unused) {
        }
        if (classLoader instanceof BaseDexClassLoader) {
            return classLoader;
        }
        return null;
    }

    private static File k(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            p(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            p(file2);
        }
        File file3 = new File(file2, str);
        p(file3);
        return file3;
    }

    public static void l(Context context) {
        if (f30961k) {
            return;
        }
        try {
            ApplicationInfo i4 = i(context);
            if (i4 == null) {
                return;
            }
            e(context, new File(i4.sourceDir), new File(i4.dataDir), "secondary-dexes", "", true);
        } catch (Exception e4) {
            throw new RuntimeException("MultiDex installation failed (" + e4.getMessage() + ").");
        }
    }

    public static void m(Context context, Context context2) {
        ApplicationInfo i4;
        if (f30961k) {
            return;
        }
        try {
            ApplicationInfo i5 = i(context);
            if (i5 == null || (i4 = i(context2)) == null) {
                return;
            }
            String str = context.getPackageName() + ".";
            File file = new File(i4.dataDir);
            e(context2, new File(i5.sourceDir), file, str + "secondary-dexes", str, false);
            e(context2, new File(i4.sourceDir), file, "secondary-dexes", "", false);
        } catch (Exception e4) {
            throw new RuntimeException("MultiDex installation failed (" + e4.getMessage() + ").");
        }
    }

    private static void n(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (list.isEmpty()) {
            return;
        }
        C0514b.a(classLoader, list, file);
    }

    static boolean o(String str) {
        if (str == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        if (nextToken == null || nextToken2 == null) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(nextToken);
            return parseInt > 2 || (parseInt == 2 && Integer.parseInt(nextToken2) >= 1);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static void p(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
