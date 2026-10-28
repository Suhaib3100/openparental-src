package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.motion.widget.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzmk {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzmi zzmiVar, String str) {
        StringBuilder a6 = c.a(ProtectedSandApp.s("ย"), str);
        zzd(zzmiVar, a6, 0);
        return a6.toString();
    }

    static void zzb(StringBuilder sb, int i5, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i5, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i5, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i5, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i6 = 1; i6 < str.length(); i6++) {
                char charAt = str.charAt(i6);
                if (Character.isUpperCase(charAt)) {
                    sb2.append(ProtectedSandApp.s("ร"));
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        boolean z5 = obj instanceof String;
        String s5 = ProtectedSandApp.s("ฤ");
        if (z5) {
            sb.append(s5);
            sb.append(zzni.zza(new zzjx(((String) obj).getBytes(zzlj.zzb))));
            sb.append(Typography.f27126b);
            return;
        }
        if (obj instanceof zzka) {
            sb.append(s5);
            sb.append(zzni.zza((zzka) obj));
            sb.append(Typography.f27126b);
            return;
        }
        boolean z6 = obj instanceof zzlb;
        String s6 = ProtectedSandApp.s("ล");
        String s7 = ProtectedSandApp.s("ฦ");
        String s8 = ProtectedSandApp.s("ว");
        if (z6) {
            sb.append(s8);
            zzd((zzlb) obj, sb, i5 + 2);
            sb.append(s7);
            zzc(i5, sb);
            sb.append(s6);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(ProtectedSandApp.s("ส"));
            sb.append(obj);
            return;
        }
        sb.append(s8);
        Map.Entry entry = (Map.Entry) obj;
        int i7 = i5 + 2;
        zzb(sb, i7, ProtectedSandApp.s("ศ"), entry.getKey());
        zzb(sb, i7, ProtectedSandApp.s("ษ"), entry.getValue());
        sb.append(s7);
        zzc(i5, sb);
        sb.append(s6);
    }

    private static void zzc(int i5, StringBuilder sb) {
        while (i5 > 0) {
            int i6 = 80;
            if (i5 <= 80) {
                i6 = i5;
            }
            sb.append(zza, 0, i6);
            i5 -= i6;
        }
    }

    private static void zzd(zzmi zzmiVar, StringBuilder sb, int i5) {
        String s5;
        String s6;
        String s7;
        int i6;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzmiVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            s5 = ProtectedSandApp.s("ห");
            s6 = ProtectedSandApp.s("ฬ");
            s7 = ProtectedSandApp.s("อ");
            i6 = 3;
            if (i7 >= length) {
                break;
            }
            Method method3 = declaredMethods[i7];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith(s7)) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith(s6)) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(s5)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i6);
            String s8 = ProtectedSandApp.s("ฮ");
            if (!substring.endsWith(s8) || substring.endsWith(ProtectedSandApp.s("ฯ")) || substring.equals(s8) || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                String s9 = ProtectedSandApp.s("ะ");
                if (substring.endsWith(s9) && !substring.equals(s9) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    zzb(sb, i5, substring.substring(0, substring.length() - 3), zzlb.zzbK(method, zzmiVar, new Object[0]));
                } else if (hashSet.contains(s7.concat(substring)) && (!substring.endsWith(ProtectedSandApp.s("ั")) || !treeMap.containsKey(s5.concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get(s6.concat(substring));
                    if (method4 != null) {
                        Object zzbK = zzlb.zzbK(method4, zzmiVar, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) zzlb.zzbK(method5, zzmiVar, new Object[0])).booleanValue()) {
                            }
                            zzb(sb, i5, substring, zzbK);
                        } else if (zzbK instanceof Boolean) {
                            if (!((Boolean) zzbK).booleanValue()) {
                            }
                            zzb(sb, i5, substring, zzbK);
                        } else if (zzbK instanceof Integer) {
                            if (((Integer) zzbK).intValue() == 0) {
                            }
                            zzb(sb, i5, substring, zzbK);
                        } else if (zzbK instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbK).floatValue()) == 0) {
                            }
                            zzb(sb, i5, substring, zzbK);
                        } else if (zzbK instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzbK).doubleValue()) == 0) {
                            }
                            zzb(sb, i5, substring, zzbK);
                        } else {
                            if (zzbK instanceof String) {
                                equals = zzbK.equals("");
                            } else if (zzbK instanceof zzka) {
                                equals = zzbK.equals(zzka.zzb);
                            } else if (zzbK instanceof zzmi) {
                                if (zzbK == ((zzmi) zzbK).zzbV()) {
                                }
                                zzb(sb, i5, substring, zzbK);
                            } else {
                                if ((zzbK instanceof Enum) && ((Enum) zzbK).ordinal() == 0) {
                                }
                                zzb(sb, i5, substring, zzbK);
                            }
                            if (equals) {
                            }
                            zzb(sb, i5, substring, zzbK);
                        }
                    }
                }
            } else {
                zzb(sb, i5, substring.substring(0, substring.length() - 4), zzlb.zzbK(method2, zzmiVar, new Object[0]));
            }
            i6 = 3;
        }
        if (zzmiVar instanceof zzky) {
            throw null;
        }
        zznl zznlVar = ((zzlb) zzmiVar).zzc;
        if (zznlVar != null) {
            zznlVar.zzi(sb, i5);
        }
    }
}
