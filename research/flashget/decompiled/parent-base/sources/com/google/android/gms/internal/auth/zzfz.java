package com.google.android.gms.internal.auth;

import androidx.constraintlayout.core.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.m0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzfz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzfx zzfxVar, String str) {
        StringBuilder a5 = e.a(ProtectedSandApp.s("콕"), str);
        zzd(zzfxVar, a5, 0);
        return a5.toString();
    }

    static void zzb(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i4, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (Character.isUpperCase(charAt)) {
                    sb2.append(ProtectedSandApp.s("콖"));
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        boolean z4 = obj instanceof String;
        String s4 = ProtectedSandApp.s("콗");
        if (z4) {
            sb.append(s4);
            sb.append(zzgx.zza(new zzec(((String) obj).getBytes(zzfa.zzb))));
            sb.append(m0.quote);
            return;
        }
        if (obj instanceof zzef) {
            sb.append(s4);
            sb.append(zzgx.zza((zzef) obj));
            sb.append(m0.quote);
            return;
        }
        boolean z5 = obj instanceof zzev;
        String s5 = ProtectedSandApp.s("콘");
        String s6 = ProtectedSandApp.s("콙");
        String s7 = ProtectedSandApp.s("콚");
        if (z5) {
            sb.append(s7);
            zzd((zzev) obj, sb, i4 + 2);
            sb.append(s6);
            zzc(i4, sb);
            sb.append(s5);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(ProtectedSandApp.s("콝"));
            sb.append(obj);
            return;
        }
        sb.append(s7);
        Map.Entry entry = (Map.Entry) obj;
        int i6 = i4 + 2;
        zzb(sb, i6, ProtectedSandApp.s("콛"), entry.getKey());
        zzb(sb, i6, ProtectedSandApp.s("콜"), entry.getValue());
        sb.append(s6);
        zzc(i4, sb);
        sb.append(s5);
    }

    private static void zzc(int i4, StringBuilder sb) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb.append(zza, 0, i5);
            i4 -= i5;
        }
    }

    private static void zzd(zzfx zzfxVar, StringBuilder sb, int i4) {
        String s4;
        String s5;
        String s6;
        int i5;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfxVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i6 = 0;
        while (true) {
            s4 = ProtectedSandApp.s("콞");
            s5 = ProtectedSandApp.s("콟");
            s6 = ProtectedSandApp.s("콠");
            i5 = 3;
            if (i6 >= length) {
                break;
            }
            Method method3 = declaredMethods[i6];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith(s6)) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith(s5)) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(s4)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i6++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i5);
            String s7 = ProtectedSandApp.s("콡");
            if (!substring.endsWith(s7) || substring.endsWith(ProtectedSandApp.s("콢")) || substring.equals(s7) || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                String s10 = ProtectedSandApp.s("콣");
                if (substring.endsWith(s10) && !substring.equals(s10) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    zzb(sb, i4, substring.substring(0, substring.length() - 3), zzev.zzg(method, zzfxVar, new Object[0]));
                } else if (hashSet.contains(s6.concat(substring)) && (!substring.endsWith(ProtectedSandApp.s("콤")) || !treeMap.containsKey(s4.concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get(s5.concat(substring));
                    if (method4 != null) {
                        Object zzg = zzev.zzg(method4, zzfxVar, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) zzev.zzg(method5, zzfxVar, new Object[0])).booleanValue()) {
                            }
                            zzb(sb, i4, substring, zzg);
                        } else if (zzg instanceof Boolean) {
                            if (!((Boolean) zzg).booleanValue()) {
                            }
                            zzb(sb, i4, substring, zzg);
                        } else if (zzg instanceof Integer) {
                            if (((Integer) zzg).intValue() == 0) {
                            }
                            zzb(sb, i4, substring, zzg);
                        } else if (zzg instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzg).floatValue()) == 0) {
                            }
                            zzb(sb, i4, substring, zzg);
                        } else if (zzg instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzg).doubleValue()) == 0) {
                            }
                            zzb(sb, i4, substring, zzg);
                        } else {
                            if (zzg instanceof String) {
                                equals = zzg.equals("");
                            } else if (zzg instanceof zzef) {
                                equals = zzg.equals(zzef.zzb);
                            } else if (zzg instanceof zzfx) {
                                if (zzg == ((zzfx) zzg).zze()) {
                                }
                                zzb(sb, i4, substring, zzg);
                            } else {
                                if ((zzg instanceof Enum) && ((Enum) zzg).ordinal() == 0) {
                                }
                                zzb(sb, i4, substring, zzg);
                            }
                            if (equals) {
                            }
                            zzb(sb, i4, substring, zzg);
                        }
                    }
                }
            } else {
                zzb(sb, i4, substring.substring(0, substring.length() - 4), zzev.zzg(method2, zzfxVar, new Object[0]));
            }
            i5 = 3;
        }
        if (zzfxVar instanceof zzeu) {
            throw null;
        }
        zzha zzhaVar = ((zzev) zzfxVar).zzc;
        if (zzhaVar != null) {
            zzhaVar.zzg(sb, i4);
        }
    }
}
