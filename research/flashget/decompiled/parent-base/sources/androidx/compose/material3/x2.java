package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.profileinstaller.o;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¨\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a¨\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a¨\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001a\u0010\u0016\u001a¨\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\u001a°\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001d2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a°\u0001\u0010!\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001d2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010 \u001aÇ\u0001\u0010#\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001d2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0091\u0001\u0010&\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b&\u0010'\u001a\u0091\u0001\u0010(\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b(\u0010)\u001a\u0091\u0001\u0010*\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b*\u0010'\u001a\u0091\u0001\u0010+\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b+\u0010)\u001a¹\u0001\u00104\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u0010\u0014\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÎ\u0001\u00106\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010-\u001a\u00020,2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u0010\u0014\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u0094\u0001\u0010:\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0003ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a-\u0010?\u001a\u0002022\b\b\u0002\u0010<\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010@\"\u0014\u0010B\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010A\"\u0014\u0010D\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010C\"\u0014\u0010E\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010C\"\u0014\u0010F\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010C\"\u0014\u0010I\u001a\u00020G8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010H\"\u0014\u0010J\u001a\u00020G8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010H\"\u0014\u0010K\u001a\u00020G8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010H\"\u0018\u0010O\u001a\u00020\r*\u00020L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "onClick", "Landroidx/compose/runtime/i;", "label", "Landroidx/compose/ui/q;", "modifier", "", "enabled", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/material3/v2;", "colors", "Landroidx/compose/material3/w2;", "elevation", "Landroidx/compose/foundation/c0;", "border", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "a", "(Lld/a;Lld/p;Landroidx/compose/ui/q;ZLld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/v2;Landroidx/compose/material3/w2;Landroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/material3/u2;", "b", "(Lld/a;Lld/p;Landroidx/compose/ui/q;ZLld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/v2;Landroidx/compose/material3/w2;Landroidx/compose/material3/u2;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;III)V", "e", "f", "selected", "Landroidx/compose/material3/q8;", "Landroidx/compose/material3/r8;", "j", "(ZLld/a;Lld/p;Landroidx/compose/ui/q;ZLld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/q8;Landroidx/compose/material3/r8;Landroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;III)V", "g", "avatar", "k", "(ZLld/a;Lld/p;Landroidx/compose/ui/q;ZLld/p;Lld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/q8;Landroidx/compose/material3/r8;Landroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;III)V", "icon", "m", "(Lld/a;Lld/p;Landroidx/compose/ui/q;ZLld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/v2;Landroidx/compose/material3/w2;Landroidx/compose/foundation/c0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "n", "(Lld/a;Lld/p;Landroidx/compose/ui/q;ZLld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/v2;Landroidx/compose/material3/w2;Landroidx/compose/material3/u2;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "h", "i", "Landroidx/compose/ui/text/v0;", "labelTextStyle", "Landroidx/compose/ui/graphics/d2;", "labelColor", "Landroidx/compose/ui/unit/h;", "minHeight", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "c", "(Landroidx/compose/ui/q;Lld/a;ZLld/p;Landroidx/compose/ui/text/v0;JLld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/v2;Landroidx/compose/material3/w2;Landroidx/compose/foundation/c0;FLandroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "l", "(ZLandroidx/compose/ui/q;Lld/a;ZLld/p;Landroidx/compose/ui/text/v0;Lld/p;Lld/p;Lld/p;Landroidx/compose/ui/graphics/e6;Landroidx/compose/material3/q8;Landroidx/compose/material3/r8;Landroidx/compose/foundation/c0;FLandroidx/compose/foundation/layout/l1;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "leadingIconColor", "trailingIconColor", "d", "(Lld/p;Landroidx/compose/ui/text/v0;JLld/p;Lld/p;Lld/p;JJFLandroidx/compose/foundation/layout/l1;Landroidx/compose/runtime/t;I)V", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "t", "(ZZZ)Landroidx/compose/foundation/layout/l1;", "F", "HorizontalElementsPadding", "Landroidx/compose/foundation/layout/l1;", "AssistChipPadding", "FilterChipPadding", "SuggestionChipPadding", "", "Ljava/lang/String;", "LeadingIconLayoutId", "LabelLayoutId", "TrailingIconLayoutId", "Landroidx/compose/material3/a3;", "s", "(Landroidx/compose/material3/a3;)Landroidx/compose/material3/v2;", "defaultSuggestionChipColors", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2741:1\n1116#2,6:2742\n1116#2,6:2748\n1116#2,6:2754\n1116#2,6:2760\n1116#2,6:2766\n1116#2,6:2772\n1116#2,6:2778\n1116#2,6:2784\n1116#2,6:2790\n1116#2,6:2796\n1116#2,6:2802\n154#3:2808\n154#3:2809\n154#3:2810\n154#3:2811\n154#3:2812\n154#3:2813\n154#3:2814\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n*L\n124#1:2742,6\n204#1:2748,6\n275#1:2754,6\n354#1:2760,6\n435#1:2766,6\n514#1:2772,6\n598#1:2778,6\n693#1:2784,6\n770#1:2790,6\n838#1:2796,6\n914#1:2802,6\n1869#1:2808\n1870#1:2809\n1916#1:2810\n1917#1:2811\n2713#1:2812\n2714#1:2813\n2721#1:2814\n*E\n"})
/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f15337a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f15338b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f15339c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f15340d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f15341e = "leadingIcon";

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final String f15342f = "label";

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final String f15343g = "trailingIcon";

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15344b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15345c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15346d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15347e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15348f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15349g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15350h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ v2 f15351i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ w2 f15352j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15353k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15354l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15355m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f15356n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15357o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5, int i6) {
            super(2);
            this.f15344b = aVar;
            this.f15345c = pVar;
            this.f15346d = qVar;
            this.f15347e = z4;
            this.f15348f = pVar2;
            this.f15349g = pVar3;
            this.f15350h = e6Var;
            this.f15351i = v2Var;
            this.f15352j = w2Var;
            this.f15353k = c0Var;
            this.f15354l = kVar;
            this.f15355m = i4;
            this.f15356n = i5;
            this.f15357o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.a(this.f15344b, this.f15345c, this.f15346d, this.f15347e, this.f15348f, this.f15349g, this.f15350h, this.f15351i, this.f15352j, this.f15353k, this.f15354l, tVar, androidx.compose.runtime.g3.b(this.f15355m | 1), androidx.compose.runtime.g3.b(this.f15356n), this.f15357o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15358b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15359c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15360d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15361e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15362f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15363g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15364h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ v2 f15365i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ w2 f15366j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u2 f15367k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15368l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15369m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f15370n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15371o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, u2 u2Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5, int i6) {
            super(2);
            this.f15358b = aVar;
            this.f15359c = pVar;
            this.f15360d = qVar;
            this.f15361e = z4;
            this.f15362f = pVar2;
            this.f15363g = pVar3;
            this.f15364h = e6Var;
            this.f15365i = v2Var;
            this.f15366j = w2Var;
            this.f15367k = u2Var;
            this.f15368l = kVar;
            this.f15369m = i4;
            this.f15370n = i5;
            this.f15371o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.b(this.f15358b, this.f15359c, this.f15360d, this.f15361e, this.f15362f, this.f15363g, this.f15364h, this.f15365i, this.f15366j, this.f15367k, this.f15368l, tVar, androidx.compose.runtime.g3.b(this.f15369m | 1), androidx.compose.runtime.g3.b(this.f15370n), this.f15371o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15372b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20309c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15373b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15374c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15375d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15376e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15377f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ v2 f15378g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f15379h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f15380i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f15381j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, v2 v2Var, boolean z4, float f4, androidx.compose.foundation.layout.l1 l1Var) {
            super(2);
            this.f15373b = pVar;
            this.f15374c = v0Var;
            this.f15375d = j4;
            this.f15376e = pVar2;
            this.f15377f = pVar3;
            this.f15378g = v2Var;
            this.f15379h = z4;
            this.f15380i = f4;
            this.f15381j = l1Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1985962652, i4, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1873)");
            }
            x2.d(this.f15373b, this.f15374c, this.f15375d, this.f15376e, null, this.f15377f, this.f15378g.m(this.f15379h), this.f15378g.n(this.f15379h), this.f15380i, this.f15381j, tVar, 24576);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15382b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15383c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f15384d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15385e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15386f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f15387g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15388h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15389i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15390j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ v2 f15391k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ w2 f15392l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15393m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f15394n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f15395o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15396p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f15397q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f15398r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.q qVar, ld.a<kotlin.k2> aVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, androidx.compose.foundation.c0 c0Var, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f15382b = qVar;
            this.f15383c = aVar;
            this.f15384d = z4;
            this.f15385e = pVar;
            this.f15386f = v0Var;
            this.f15387g = j4;
            this.f15388h = pVar2;
            this.f15389i = pVar3;
            this.f15390j = e6Var;
            this.f15391k = v2Var;
            this.f15392l = w2Var;
            this.f15393m = c0Var;
            this.f15394n = f4;
            this.f15395o = l1Var;
            this.f15396p = kVar;
            this.f15397q = i4;
            this.f15398r = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.c(this.f15382b, this.f15383c, this.f15384d, this.f15385e, this.f15386f, this.f15387g, this.f15388h, this.f15389i, this.f15390j, this.f15391k, this.f15392l, this.f15393m, this.f15394n, this.f15395o, this.f15396p, tVar, androidx.compose.runtime.g3.b(this.f15397q | 1), androidx.compose.runtime.g3.b(this.f15398r));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,2741:1\n78#2,11:2742\n78#2,11:2775\n91#2:2807\n78#2,11:2812\n91#2:2844\n78#2,11:2851\n91#2:2883\n91#2:2888\n456#3,8:2753\n464#3,3:2767\n456#3,8:2786\n464#3,3:2800\n467#3,3:2804\n456#3,8:2823\n464#3,3:2837\n467#3,3:2841\n456#3,8:2862\n464#3,3:2876\n467#3,3:2880\n467#3,3:2885\n3737#4,6:2761\n3737#4,6:2794\n3737#4,6:2831\n3737#4,6:2870\n69#5,5:2770\n74#5:2803\n78#5:2808\n69#5,5:2846\n74#5:2879\n78#5:2884\n154#6:2809\n91#7,2:2810\n93#7:2840\n97#7:2845\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1\n*L\n1953#1:2742,11\n1959#1:2775,11\n1959#1:2807\n1975#1:2812,11\n1975#1:2844\n1984#1:2851,11\n1984#1:2883\n1953#1:2888\n1953#1:2753,8\n1953#1:2767,3\n1959#1:2786,8\n1959#1:2800,3\n1959#1:2804,3\n1975#1:2823,8\n1975#1:2837,3\n1975#1:2841,3\n1984#1:2862,8\n1984#1:2876,3\n1984#1:2880,3\n1953#1:2885,3\n1953#1:2761,6\n1959#1:2794,6\n1975#1:2831,6\n1984#1:2870,6\n1959#1:2770,5\n1959#1:2803\n1959#1:2808\n1984#1:2846,5\n1984#1:2879\n1984#1:2884\n1978#1:2809\n1975#1:2810,2\n1975#1:2840\n1975#1:2845\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f15400c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15401d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15402e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15403f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f15404g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15405h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f15406i;

        /* compiled from: Chip.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2741:1\n116#2,2:2742\n33#2,6:2744\n118#2:2750\n116#2,2:2751\n33#2,6:2753\n118#2:2759\n544#2,2:2760\n33#2,6:2762\n546#2:2768\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1$1\n*L\n1999#1:2742,2\n1999#1:2744,6\n1999#1:2750\n2005#1:2751,2\n2005#1:2753,6\n2005#1:2759\n2010#1:2760,2\n2010#1:2762,6\n2010#1:2768\n*E\n"})
        static final class a implements androidx.compose.ui.layout.m0 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f15407a = new a();

            /* compiled from: Chip.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.x2$f$a$a, reason: collision with other inner class name */
            static final class C0299a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.i1 f15408b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f15409c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f15410d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.i1 f15411e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ int f15412f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.i1 f15413g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ int f15414h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0299a(androidx.compose.ui.layout.i1 i1Var, int i4, int i5, androidx.compose.ui.layout.i1 i1Var2, int i6, androidx.compose.ui.layout.i1 i1Var3, int i7) {
                    super(1);
                    this.f15408b = i1Var;
                    this.f15409c = i4;
                    this.f15410d = i5;
                    this.f15411e = i1Var2;
                    this.f15412f = i6;
                    this.f15413g = i1Var3;
                    this.f15414h = i7;
                }

                public final void a(@fg.l i1.a aVar) {
                    androidx.compose.ui.layout.i1 i1Var = this.f15408b;
                    if (i1Var != null) {
                        i1.a.m(aVar, i1Var, 0, androidx.compose.ui.c.INSTANCE.q().a(this.f15409c, this.f15410d), 0.0f, 4, null);
                    }
                    i1.a.m(aVar, this.f15411e, this.f15412f, 0, 0.0f, 4, null);
                    androidx.compose.ui.layout.i1 i1Var2 = this.f15413g;
                    if (i1Var2 != null) {
                        i1.a.m(aVar, i1Var2, this.f15411e.getWidth() + this.f15412f, androidx.compose.ui.c.INSTANCE.q().a(this.f15414h, this.f15410d), 0.0f, 4, null);
                    }
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                    a(aVar);
                    return kotlin.k2.f75408a;
                }
            }

            a() {
            }

            @Override // androidx.compose.ui.layout.m0
            @fg.l
            public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
                androidx.compose.ui.layout.l0 l0Var;
                androidx.compose.ui.layout.l0 l0Var2;
                int size = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        l0Var = null;
                        break;
                    }
                    l0Var = list.get(i4);
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), "leadingIcon")) {
                        break;
                    }
                    i4++;
                }
                androidx.compose.ui.layout.l0 l0Var3 = l0Var;
                androidx.compose.ui.layout.i1 m02 = l0Var3 != null ? l0Var3.m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null)) : null;
                int o4 = sa.o(m02);
                int n4 = sa.n(m02);
                int size2 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        l0Var2 = null;
                        break;
                    }
                    l0Var2 = list.get(i5);
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), "trailingIcon")) {
                        break;
                    }
                    i5++;
                }
                androidx.compose.ui.layout.l0 l0Var4 = l0Var2;
                androidx.compose.ui.layout.i1 m03 = l0Var4 != null ? l0Var4.m0(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null)) : null;
                int o5 = sa.o(m03);
                int n5 = sa.n(m03);
                int size3 = list.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    androidx.compose.ui.layout.l0 l0Var5 = list.get(i6);
                    if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var5), "label")) {
                        androidx.compose.ui.layout.i1 m04 = l0Var5.m0(androidx.compose.ui.unit.c.j(j4, -(o4 + o5), 0, 2, null));
                        int width = m04.getWidth() + o4 + o5;
                        int max = Math.max(n4, Math.max(m04.getHeight(), n5));
                        return androidx.compose.ui.layout.o0.x2(o0Var, width, max, null, new C0299a(m02, n4, max, m04, o4, m03, n5), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(float f4, androidx.compose.foundation.layout.l1 l1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, long j5) {
            super(2);
            this.f15399b = f4;
            this.f15400c = l1Var;
            this.f15401d = pVar;
            this.f15402e = pVar2;
            this.f15403f = pVar3;
            this.f15404g = j4;
            this.f15405h = pVar4;
            this.f15406i = j5;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1748799148, i4, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1952)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.foundation.layout.c2.b(companion, 0.0f, this.f15399b, 1, null), this.f15400c);
            a aVar = a.f15407a;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f15401d;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f15402e;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f15403f;
            long j5 = this.f15404g;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar4 = this.f15405h;
            long j6 = this.f15406i;
            tVar.P(-1323940314);
            int j7 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(j4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            androidx.compose.runtime.m5.j(tVar, aVar, companion2.f());
            androidx.compose.runtime.m5.j(tVar, B, companion2.h());
            ld.p<androidx.compose.ui.node.g, Integer, kotlin.k2> b5 = companion2.b();
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j7))) {
                androidx.compose.animation.d.a(j7, tVar, j7, b5);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            tVar.P(651014582);
            if (pVar != null || pVar2 != null) {
                androidx.compose.ui.q b6 = androidx.compose.ui.layout.w.b(companion, "leadingIcon");
                androidx.compose.ui.c i5 = androidx.compose.ui.c.INSTANCE.i();
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 i6 = androidx.compose.foundation.layout.m.i(i5, false, tVar, 6);
                tVar.P(-1323940314);
                int j10 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B2 = tVar.B();
                ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(b6);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, i6, tVar, B2);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j10))) {
                    androidx.compose.animation.d.a(j10, tVar, j10, a7);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar5 = androidx.compose.foundation.layout.p.f5235a;
                if (pVar != null) {
                    tVar.P(1725997334);
                    pVar.invoke(tVar, 0);
                    tVar.p0();
                } else if (pVar2 != null) {
                    tVar.P(1725997437);
                    androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j5)), pVar2, tVar, androidx.compose.runtime.b3.f15974d);
                    tVar.p0();
                } else {
                    tVar.P(1725997699);
                    tVar.p0();
                }
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
            }
            tVar.p0();
            androidx.compose.ui.q l4 = androidx.compose.foundation.layout.j1.l(androidx.compose.ui.layout.w.b(companion, "label"), x2.f15337a, androidx.compose.ui.unit.h.g(0));
            i.e p4 = androidx.compose.foundation.layout.i.f5073a.p();
            c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            c.InterfaceC0326c q4 = companion3.q();
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(p4, q4, tVar, 54);
            tVar.P(-1323940314);
            int j11 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B3 = tVar.B();
            ld.a<androidx.compose.ui.node.g> a8 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(l4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a8);
            } else {
                tVar.C();
            }
            ld.p a10 = androidx.compose.animation.p.a(companion2, tVar, d5, tVar, B3);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j11))) {
                androidx.compose.animation.d.a(j11, tVar, j11, a10);
            }
            androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            pVar4.invoke(tVar, 0);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            tVar.P(-313041276);
            if (pVar3 != null) {
                androidx.compose.ui.q b7 = androidx.compose.ui.layout.w.b(companion, "trailingIcon");
                androidx.compose.ui.c i7 = companion3.i();
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 i10 = androidx.compose.foundation.layout.m.i(i7, false, tVar, 6);
                tVar.P(-1323940314);
                int j12 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B4 = tVar.B();
                ld.a<androidx.compose.ui.node.g> a11 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g7 = androidx.compose.ui.layout.a0.g(b7);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a11);
                } else {
                    tVar.C();
                }
                ld.p a12 = androidx.compose.animation.p.a(companion2, tVar, i10, tVar, B4);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j12))) {
                    androidx.compose.animation.d.a(j12, tVar, j12, a12);
                }
                androidx.compose.animation.e.a(0, g7, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar6 = androidx.compose.foundation.layout.p.f5235a;
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j6)), pVar3, tVar, androidx.compose.runtime.b3.f15974d);
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
            }
            tVar.p0();
            tVar.p0();
            tVar.H();
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15415b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15416c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15417d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15418e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15419f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15420g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f15421h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f15422i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f15423j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f15424k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15425l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, long j5, long j6, float f4, androidx.compose.foundation.layout.l1 l1Var, int i4) {
            super(2);
            this.f15415b = pVar;
            this.f15416c = v0Var;
            this.f15417d = j4;
            this.f15418e = pVar2;
            this.f15419f = pVar3;
            this.f15420g = pVar4;
            this.f15421h = j5;
            this.f15422i = j6;
            this.f15423j = f4;
            this.f15424k = l1Var;
            this.f15425l = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.d(this.f15415b, this.f15416c, this.f15417d, this.f15418e, this.f15419f, this.f15420g, this.f15421h, this.f15422i, this.f15423j, this.f15424k, tVar, androidx.compose.runtime.g3.b(this.f15425l | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15426b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15427c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15428d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15429e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15430f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15431g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15432h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ v2 f15433i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ w2 f15434j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15435k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15436l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15437m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f15438n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15439o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5, int i6) {
            super(2);
            this.f15426b = aVar;
            this.f15427c = pVar;
            this.f15428d = qVar;
            this.f15429e = z4;
            this.f15430f = pVar2;
            this.f15431g = pVar3;
            this.f15432h = e6Var;
            this.f15433i = v2Var;
            this.f15434j = w2Var;
            this.f15435k = c0Var;
            this.f15436l = kVar;
            this.f15437m = i4;
            this.f15438n = i5;
            this.f15439o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.e(this.f15426b, this.f15427c, this.f15428d, this.f15429e, this.f15430f, this.f15431g, this.f15432h, this.f15433i, this.f15434j, this.f15435k, this.f15436l, tVar, androidx.compose.runtime.g3.b(this.f15437m | 1), androidx.compose.runtime.g3.b(this.f15438n), this.f15439o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15440b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15441c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15442d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15443e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15444f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15445g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15446h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ v2 f15447i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ w2 f15448j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u2 f15449k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15450l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15451m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f15452n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15453o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, u2 u2Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5, int i6) {
            super(2);
            this.f15440b = aVar;
            this.f15441c = pVar;
            this.f15442d = qVar;
            this.f15443e = z4;
            this.f15444f = pVar2;
            this.f15445g = pVar3;
            this.f15446h = e6Var;
            this.f15447i = v2Var;
            this.f15448j = w2Var;
            this.f15449k = u2Var;
            this.f15450l = kVar;
            this.f15451m = i4;
            this.f15452n = i5;
            this.f15453o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.f(this.f15440b, this.f15441c, this.f15442d, this.f15443e, this.f15444f, this.f15445g, this.f15446h, this.f15447i, this.f15448j, this.f15449k, this.f15450l, tVar, androidx.compose.runtime.g3.b(this.f15451m | 1), androidx.compose.runtime.g3.b(this.f15452n), this.f15453o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15454b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15455c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15456d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15457e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15458f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15459g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15460h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15461i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ q8 f15462j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ r8 f15463k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15464l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15465m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f15466n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15467o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f15468p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(boolean z4, ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, q8 q8Var, r8 r8Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5, int i6) {
            super(2);
            this.f15454b = z4;
            this.f15455c = aVar;
            this.f15456d = pVar;
            this.f15457e = qVar;
            this.f15458f = z5;
            this.f15459g = pVar2;
            this.f15460h = pVar3;
            this.f15461i = e6Var;
            this.f15462j = q8Var;
            this.f15463k = r8Var;
            this.f15464l = c0Var;
            this.f15465m = kVar;
            this.f15466n = i4;
            this.f15467o = i5;
            this.f15468p = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.g(this.f15454b, this.f15455c, this.f15456d, this.f15457e, this.f15458f, this.f15459g, this.f15460h, this.f15461i, this.f15462j, this.f15463k, this.f15464l, this.f15465m, tVar, androidx.compose.runtime.g3.b(this.f15466n | 1), androidx.compose.runtime.g3.b(this.f15467o), this.f15468p);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15469b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15470c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15471d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15472e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15473f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15474g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ v2 f15475h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w2 f15476i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15477j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15478k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15479l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15480m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f15469b = aVar;
            this.f15470c = pVar;
            this.f15471d = qVar;
            this.f15472e = z4;
            this.f15473f = pVar2;
            this.f15474g = e6Var;
            this.f15475h = v2Var;
            this.f15476i = w2Var;
            this.f15477j = c0Var;
            this.f15478k = kVar;
            this.f15479l = i4;
            this.f15480m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.h(this.f15469b, this.f15470c, this.f15471d, this.f15472e, this.f15473f, this.f15474g, this.f15475h, this.f15476i, this.f15477j, this.f15478k, tVar, androidx.compose.runtime.g3.b(this.f15479l | 1), this.f15480m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15481b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15482c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15483d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15484e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15485f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15486g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ v2 f15487h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w2 f15488i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u2 f15489j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15490k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15491l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15492m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, u2 u2Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f15481b = aVar;
            this.f15482c = pVar;
            this.f15483d = qVar;
            this.f15484e = z4;
            this.f15485f = pVar2;
            this.f15486g = e6Var;
            this.f15487h = v2Var;
            this.f15488i = w2Var;
            this.f15489j = u2Var;
            this.f15490k = kVar;
            this.f15491l = i4;
            this.f15492m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.i(this.f15481b, this.f15482c, this.f15483d, this.f15484e, this.f15485f, this.f15486g, this.f15487h, this.f15488i, this.f15489j, this.f15490k, tVar, androidx.compose.runtime.g3.b(this.f15491l | 1), this.f15492m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15493b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15494c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15495d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15496e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15497f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15498g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15499h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15500i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ q8 f15501j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ r8 f15502k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15503l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15504m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f15505n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15506o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f15507p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(boolean z4, ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, q8 q8Var, r8 r8Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5, int i6) {
            super(2);
            this.f15493b = z4;
            this.f15494c = aVar;
            this.f15495d = pVar;
            this.f15496e = qVar;
            this.f15497f = z5;
            this.f15498g = pVar2;
            this.f15499h = pVar3;
            this.f15500i = e6Var;
            this.f15501j = q8Var;
            this.f15502k = r8Var;
            this.f15503l = c0Var;
            this.f15504m = kVar;
            this.f15505n = i4;
            this.f15506o = i5;
            this.f15507p = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.j(this.f15493b, this.f15494c, this.f15495d, this.f15496e, this.f15497f, this.f15498g, this.f15499h, this.f15500i, this.f15501j, this.f15502k, this.f15503l, this.f15504m, tVar, androidx.compose.runtime.g3.b(this.f15505n | 1), androidx.compose.runtime.g3.b(this.f15506o), this.f15507p);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$InputChip$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2741:1\n1116#2,6:2742\n69#3,5:2748\n74#3:2781\n78#3:2786\n78#4,11:2753\n91#4:2785\n456#5,8:2764\n464#5,3:2778\n467#5,3:2782\n3737#6,6:2772\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$InputChip$2\n*L\n608#1:2742,6\n607#1:2748,5\n607#1:2781\n607#1:2786\n607#1:2753,11\n607#1:2785\n607#1:2764,8\n607#1:2778,3\n607#1:2782,3\n607#1:2772,6\n*E\n"})
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15509c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15510d;

        /* compiled from: Chip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.q4, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f15511b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.e6 f15512c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(float f4, androidx.compose.ui.graphics.e6 e6Var) {
                super(1);
                this.f15511b = f4;
                this.f15512c = e6Var;
            }

            public final void a(@fg.l androidx.compose.ui.graphics.q4 q4Var) {
                q4Var.k(this.f15511b);
                q4Var.h5(this.f15512c);
                q4Var.g2(true);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.q4 q4Var) {
                a(q4Var);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(float f4, androidx.compose.ui.graphics.e6 e6Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f15508b = f4;
            this.f15509c = e6Var;
            this.f15510d = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1154227507, i4, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:606)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(946467138);
            boolean d5 = tVar.d(this.f15508b) | tVar.q0(this.f15509c);
            float f4 = this.f15508b;
            androidx.compose.ui.graphics.e6 e6Var = this.f15509c;
            Object Q = tVar.Q();
            if (d5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(f4, e6Var);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q a5 = androidx.compose.ui.graphics.p4.a(companion, (ld.l) Q);
            androidx.compose.ui.c i5 = androidx.compose.ui.c.INSTANCE.i();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f15510d;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 i6 = androidx.compose.foundation.layout.m.i(i5, false, tVar, 6);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(a5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, i6, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15513b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15514c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15515d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15516e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15517f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15518g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15519h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15520i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15521j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ q8 f15522k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ r8 f15523l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15524m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15525n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15526o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f15527p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f15528q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(boolean z4, ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, androidx.compose.ui.graphics.e6 e6Var, q8 q8Var, r8 r8Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5, int i6) {
            super(2);
            this.f15513b = z4;
            this.f15514c = aVar;
            this.f15515d = pVar;
            this.f15516e = qVar;
            this.f15517f = z5;
            this.f15518g = pVar2;
            this.f15519h = pVar3;
            this.f15520i = pVar4;
            this.f15521j = e6Var;
            this.f15522k = q8Var;
            this.f15523l = r8Var;
            this.f15524m = c0Var;
            this.f15525n = kVar;
            this.f15526o = i4;
            this.f15527p = i5;
            this.f15528q = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.k(this.f15513b, this.f15514c, this.f15515d, this.f15516e, this.f15517f, this.f15518g, this.f15519h, this.f15520i, this.f15521j, this.f15522k, this.f15523l, this.f15524m, this.f15525n, tVar, androidx.compose.runtime.g3.b(this.f15526o | 1), androidx.compose.runtime.g3.b(this.f15527p), this.f15528q);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f15529b = new p(1);

        p() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20310d);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q8 f15530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f15531c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f15532d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15533e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15534f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15535g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15536h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15537i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f15538j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f15539k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(q8 q8Var, boolean z4, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, float f4, androidx.compose.foundation.layout.l1 l1Var) {
            super(2);
            this.f15530b = q8Var;
            this.f15531c = z4;
            this.f15532d = z5;
            this.f15533e = pVar;
            this.f15534f = v0Var;
            this.f15535g = pVar2;
            this.f15536h = pVar3;
            this.f15537i = pVar4;
            this.f15538j = f4;
            this.f15539k = l1Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-577614814, i4, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1920)");
            }
            x2.d(this.f15533e, this.f15534f, this.f15530b.d(this.f15531c, this.f15532d), this.f15535g, this.f15536h, this.f15537i, this.f15530b.e(this.f15531c, this.f15532d), this.f15530b.f(this.f15531c, this.f15532d), this.f15538j, this.f15539k, tVar, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class r extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f15540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15542d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15543e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15544f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15545g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15546h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15547i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15548j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15549k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ q8 f15550l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ r8 f15551m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15552n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f15553o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f15554p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15555q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f15556r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f15557s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(boolean z4, androidx.compose.ui.q qVar, ld.a<kotlin.k2> aVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, androidx.compose.ui.graphics.e6 e6Var, q8 q8Var, r8 r8Var, androidx.compose.foundation.c0 c0Var, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f15540b = z4;
            this.f15541c = qVar;
            this.f15542d = aVar;
            this.f15543e = z5;
            this.f15544f = pVar;
            this.f15545g = v0Var;
            this.f15546h = pVar2;
            this.f15547i = pVar3;
            this.f15548j = pVar4;
            this.f15549k = e6Var;
            this.f15550l = q8Var;
            this.f15551m = r8Var;
            this.f15552n = c0Var;
            this.f15553o = f4;
            this.f15554p = l1Var;
            this.f15555q = kVar;
            this.f15556r = i4;
            this.f15557s = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.l(this.f15540b, this.f15541c, this.f15542d, this.f15543e, this.f15544f, this.f15545g, this.f15546h, this.f15547i, this.f15548j, this.f15549k, this.f15550l, this.f15551m, this.f15552n, this.f15553o, this.f15554p, this.f15555q, tVar, androidx.compose.runtime.g3.b(this.f15556r | 1), androidx.compose.runtime.g3.b(this.f15557s));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15559c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15560d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15561e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15562f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15563g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ v2 f15564h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w2 f15565i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.c0 f15566j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15567k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15568l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15569m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, androidx.compose.foundation.c0 c0Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f15558b = aVar;
            this.f15559c = pVar;
            this.f15560d = qVar;
            this.f15561e = z4;
            this.f15562f = pVar2;
            this.f15563g = e6Var;
            this.f15564h = v2Var;
            this.f15565i = w2Var;
            this.f15566j = c0Var;
            this.f15567k = kVar;
            this.f15568l = i4;
            this.f15569m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.m(this.f15558b, this.f15559c, this.f15560d, this.f15561e, this.f15562f, this.f15563g, this.f15564h, this.f15565i, this.f15566j, this.f15567k, tVar, androidx.compose.runtime.g3.b(this.f15568l | 1), this.f15569m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class t extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f15570b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15571c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15572d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15573e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15574f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f15575g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ v2 f15576h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w2 f15577i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u2 f15578j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f15579k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f15580l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15581m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(ld.a<kotlin.k2> aVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, u2 u2Var, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f15570b = aVar;
            this.f15571c = pVar;
            this.f15572d = qVar;
            this.f15573e = z4;
            this.f15574f = pVar2;
            this.f15575g = e6Var;
            this.f15576h = v2Var;
            this.f15577i = w2Var;
            this.f15578j = u2Var;
            this.f15579k = kVar;
            this.f15580l = i4;
            this.f15581m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            x2.n(this.f15570b, this.f15571c, this.f15572d, this.f15573e, this.f15574f, this.f15575g, this.f15576h, this.f15577i, this.f15578j, this.f15579k, tVar, androidx.compose.runtime.g3.b(this.f15580l | 1), this.f15581m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        float g4 = androidx.compose.ui.unit.h.g(8);
        f15337a = g4;
        f15338b = androidx.compose.foundation.layout.j1.c(g4, 0.0f, 2, null);
        f15339c = androidx.compose.foundation.layout.j1.c(g4, 0.0f, 2, null);
        f15340d = androidx.compose.foundation.layout.j1.c(g4, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cc  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.a<kotlin.k2> r37, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.ui.q r39, boolean r40, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r41, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r42, @fg.m androidx.compose.ui.graphics.e6 r43, @fg.m androidx.compose.material3.v2 r44, @fg.m androidx.compose.material3.w2 r45, @fg.m androidx.compose.foundation.c0 r46, @fg.m androidx.compose.foundation.interaction.k r47, @fg.m androidx.compose.runtime.t r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.a(ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.v2, androidx.compose.material3.w2, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0329  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead", replaceWith = @kotlin.x0(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void b(ld.a r37, ld.p r38, androidx.compose.ui.q r39, boolean r40, ld.p r41, ld.p r42, androidx.compose.ui.graphics.e6 r43, androidx.compose.material3.v2 r44, androidx.compose.material3.w2 r45, androidx.compose.material3.u2 r46, androidx.compose.foundation.interaction.k r47, androidx.compose.runtime.t r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.b(ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.v2, androidx.compose.material3.w2, androidx.compose.material3.u2, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(androidx.compose.ui.q qVar, ld.a<kotlin.k2> aVar, boolean z4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.graphics.e6 e6Var, v2 v2Var, w2 w2Var, androidx.compose.foundation.c0 c0Var, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        int i7;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(1400504719);
        if ((i4 & 6) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= o4.S(aVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= o4.b(z4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= o4.q0(v0Var) ? 16384 : 8192;
        }
        int i10 = i6;
        if ((i4 & o.c.f32821k) == 0) {
            i10 |= o4.g(j4) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i10 |= o4.S(pVar2) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i10 |= o4.S(pVar3) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i10 |= o4.q0(e6Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i10 |= o4.q0(v2Var) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        int i11 = i10;
        if ((i5 & 6) == 0) {
            i7 = (o4.q0(w2Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= o4.q0(c0Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= o4.d(f4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= o4.q0(l1Var) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= o4.q0(kVar) ? 16384 : 8192;
        }
        if ((306783379 & i11) == 306783378 && (i7 & 9363) == 9362 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1400504719, i11, i7, "androidx.compose.material3.Chip (Chip.kt:1861)");
            }
            androidx.compose.ui.q f5 = androidx.compose.ui.semantics.o.f(qVar, false, c.f15372b, 1, null);
            long a5 = v2Var.a(z4);
            float m4 = w2Var != null ? w2Var.m(z4) : androidx.compose.ui.unit.h.g(0);
            o4.P(64045604);
            androidx.compose.runtime.b5<androidx.compose.ui.unit.h> l4 = w2Var != null ? w2Var.l(z4, kVar, o4, ((i11 >> 6) & 14) | ((i7 >> 9) & 112) | ((i7 << 6) & 896)) : null;
            o4.p0();
            int i12 = i7;
            tVar2 = o4;
            x9.d(aVar, f5, z4, e6Var, a5, 0L, m4, l4 != null ? l4.getValue().u() : androidx.compose.ui.unit.h.g(0), c0Var, kVar, androidx.compose.runtime.internal.c.b(tVar2, -1985962652, true, new d(pVar, v0Var, j4, pVar2, pVar3, v2Var, z4, f4, l1Var)), tVar2, ((i11 >> 15) & 7168) | ((i11 >> 3) & 14) | (i11 & 896) | ((i12 << 21) & 234881024) | (1879048192 & (i12 << 15)), 6, 32);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new e(qVar, aVar, z4, pVar, v0Var, j4, pVar2, pVar3, e6Var, v2Var, w2Var, c0Var, f4, l1Var, kVar, i4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, long j5, long j6, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-782878228);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(pVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(v0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.g(j4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.g(j5) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.g(j6) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.d(f4) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i5 |= o4.q0(l1Var) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i5 & 306783379) == 306783378 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-782878228, i5, -1, "androidx.compose.material3.ChipContent (Chip.kt:1947)");
            }
            androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(j4)), xa.f().e(v0Var)}, androidx.compose.runtime.internal.c.b(o4, 1748799148, true, new f(f4, l1Var, pVar3, pVar2, pVar4, j5, pVar, j6)), o4, 48);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new g(pVar, v0Var, j4, pVar2, pVar3, pVar4, j5, j6, f4, l1Var, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@fg.l ld.a<kotlin.k2> r37, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.ui.q r39, boolean r40, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r41, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r42, @fg.m androidx.compose.ui.graphics.e6 r43, @fg.m androidx.compose.material3.v2 r44, @fg.m androidx.compose.material3.w2 r45, @fg.m androidx.compose.foundation.c0 r46, @fg.m androidx.compose.foundation.interaction.k r47, @fg.m androidx.compose.runtime.t r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.e(ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.v2, androidx.compose.material3.w2, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c9  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead", replaceWith = @kotlin.x0(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void f(ld.a r37, ld.p r38, androidx.compose.ui.q r39, boolean r40, ld.p r41, ld.p r42, androidx.compose.ui.graphics.e6 r43, androidx.compose.material3.v2 r44, androidx.compose.material3.w2 r45, androidx.compose.material3.u2 r46, androidx.compose.foundation.interaction.k r47, androidx.compose.runtime.t r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.f(ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.v2, androidx.compose.material3.w2, androidx.compose.material3.u2, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f5  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(boolean r37, @fg.l ld.a<kotlin.k2> r38, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r39, @fg.m androidx.compose.ui.q r40, boolean r41, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r42, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r43, @fg.m androidx.compose.ui.graphics.e6 r44, @fg.m androidx.compose.material3.q8 r45, @fg.m androidx.compose.material3.r8 r46, @fg.m androidx.compose.foundation.c0 r47, @fg.m androidx.compose.foundation.interaction.k r48, @fg.m androidx.compose.runtime.t r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.g(boolean, ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.q8, androidx.compose.material3.r8, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e7  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@fg.l ld.a<kotlin.k2> r32, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, @fg.m androidx.compose.ui.q r34, boolean r35, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, @fg.m androidx.compose.ui.graphics.e6 r37, @fg.m androidx.compose.material3.v2 r38, @fg.m androidx.compose.material3.w2 r39, @fg.m androidx.compose.foundation.c0 r40, @fg.m androidx.compose.foundation.interaction.k r41, @fg.m androidx.compose.runtime.t r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.h(ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.v2, androidx.compose.material3.w2, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead", replaceWith = @kotlin.x0(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void i(ld.a r32, ld.p r33, androidx.compose.ui.q r34, boolean r35, ld.p r36, androidx.compose.ui.graphics.e6 r37, androidx.compose.material3.v2 r38, androidx.compose.material3.w2 r39, androidx.compose.material3.u2 r40, androidx.compose.foundation.interaction.k r41, androidx.compose.runtime.t r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.i(ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.v2, androidx.compose.material3.w2, androidx.compose.material3.u2, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(boolean r43, @fg.l ld.a<kotlin.k2> r44, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r45, @fg.m androidx.compose.ui.q r46, boolean r47, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r48, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r49, @fg.m androidx.compose.ui.graphics.e6 r50, @fg.m androidx.compose.material3.q8 r51, @fg.m androidx.compose.material3.r8 r52, @fg.m androidx.compose.foundation.c0 r53, @fg.m androidx.compose.foundation.interaction.k r54, @fg.m androidx.compose.runtime.t r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.j(boolean, ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.q8, androidx.compose.material3.r8, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e9  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(boolean r45, @fg.l ld.a<kotlin.k2> r46, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r47, @fg.m androidx.compose.ui.q r48, boolean r49, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r50, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r51, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r52, @fg.m androidx.compose.ui.graphics.e6 r53, @fg.m androidx.compose.material3.q8 r54, @fg.m androidx.compose.material3.r8 r55, @fg.m androidx.compose.foundation.c0 r56, @fg.m androidx.compose.foundation.interaction.k r57, @fg.m androidx.compose.runtime.t r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.k(boolean, ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, ld.p, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.q8, androidx.compose.material3.r8, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void l(boolean z4, androidx.compose.ui.q qVar, ld.a<kotlin.k2> aVar, boolean z5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, androidx.compose.ui.graphics.e6 e6Var, q8 q8Var, r8 r8Var, androidx.compose.foundation.c0 c0Var, float f4, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        int i7;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(402951308);
        if ((i4 & 6) == 0) {
            i6 = (o4.b(z4) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= o4.q0(qVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= o4.S(aVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= o4.b(z5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= o4.S(pVar) ? 16384 : 8192;
        }
        if ((i4 & o.c.f32821k) == 0) {
            i6 |= o4.q0(v0Var) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= o4.S(pVar2) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= o4.S(pVar3) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= o4.S(pVar4) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= o4.q0(e6Var) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i5 & 6) == 0) {
            i7 = (o4.q0(q8Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= o4.q0(r8Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= o4.q0(c0Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= o4.d(f4) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= o4.q0(l1Var) ? 16384 : 8192;
        }
        if ((i5 & o.c.f32821k) == 0) {
            i7 |= o4.q0(kVar) ? 131072 : 65536;
        }
        if ((i6 & 306783379) == 306783378 && (74899 & i7) == 74898 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(402951308, i6, i7, "androidx.compose.material3.SelectableChip (Chip.kt:1906)");
            }
            androidx.compose.ui.q f5 = androidx.compose.ui.semantics.o.f(qVar, false, p.f15529b, 1, null);
            int i10 = (i6 >> 9) & 14;
            long M = q8Var.a(z5, z4, o4, ((i6 << 3) & 112) | i10 | ((i7 << 6) & 896)).getValue().M();
            float m4 = r8Var != null ? r8Var.m(z5) : androidx.compose.ui.unit.h.g(0);
            o4.P(1036687729);
            androidx.compose.runtime.b5<androidx.compose.ui.unit.h> l4 = r8Var == null ? null : r8Var.l(z5, kVar, o4, i10 | ((i7 >> 12) & 112) | ((i7 << 3) & 896));
            o4.p0();
            int i11 = i6;
            int i12 = i7;
            tVar2 = o4;
            x9.b(z4, aVar, f5, z5, e6Var, M, 0L, m4, l4 != null ? l4.getValue().u() : androidx.compose.ui.unit.h.g(0), c0Var, kVar, androidx.compose.runtime.internal.c.b(o4, -577614814, true, new q(q8Var, z5, z4, pVar, v0Var, pVar2, pVar3, pVar4, f4, l1Var)), o4, (i11 & 14) | ((i11 >> 3) & 112) | (i11 & 7168) | ((i11 >> 15) & 57344) | ((i12 << 21) & 1879048192), ((i12 >> 15) & 14) | 48, 64);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new r(z4, qVar, aVar, z5, pVar, v0Var, pVar2, pVar3, pVar4, e6Var, q8Var, r8Var, c0Var, f4, l1Var, kVar, i4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(@fg.l ld.a<kotlin.k2> r32, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, @fg.m androidx.compose.ui.q r34, boolean r35, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, @fg.m androidx.compose.ui.graphics.e6 r37, @fg.m androidx.compose.material3.v2 r38, @fg.m androidx.compose.material3.w2 r39, @fg.m androidx.compose.foundation.c0 r40, @fg.m androidx.compose.foundation.interaction.k r41, @fg.m androidx.compose.runtime.t r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.m(ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.v2, androidx.compose.material3.w2, androidx.compose.foundation.c0, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead", replaceWith = @kotlin.x0(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void n(ld.a r32, ld.p r33, androidx.compose.ui.q r34, boolean r35, ld.p r36, androidx.compose.ui.graphics.e6 r37, androidx.compose.material3.v2 r38, androidx.compose.material3.w2 r39, androidx.compose.material3.u2 r40, androidx.compose.foundation.interaction.k r41, androidx.compose.runtime.t r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.x2.n(ld.a, ld.p, androidx.compose.ui.q, boolean, ld.p, androidx.compose.ui.graphics.e6, androidx.compose.material3.v2, androidx.compose.material3.w2, androidx.compose.material3.u2, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    @fg.l
    public static final v2 s(@fg.l a3 a3Var) {
        v2 defaultSuggestionChipColorsCached = a3Var.getDefaultSuggestionChipColorsCached();
        if (defaultSuggestionChipColorsCached != null) {
            return defaultSuggestionChipColorsCached;
        }
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = androidx.compose.ui.graphics.d2.f17777n;
        c0.g1 g1Var = c0.g1.f37330a;
        long h4 = b3.h(a3Var, g1Var.y());
        long h5 = b3.h(a3Var, g1Var.A());
        companion.getClass();
        long j5 = androidx.compose.ui.graphics.d2.f17778o;
        companion.getClass();
        long j6 = androidx.compose.ui.graphics.d2.f17777n;
        long w4 = androidx.compose.ui.graphics.d2.w(b3.h(a3Var, g1Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        long w5 = androidx.compose.ui.graphics.d2.w(b3.h(a3Var, g1Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        companion.getClass();
        v2 v2Var = new v2(j4, h4, h5, j5, j6, w4, w5, androidx.compose.ui.graphics.d2.f17778o, null);
        a3Var.e1(v2Var);
        return v2Var;
    }

    private static final androidx.compose.foundation.layout.l1 t(boolean z4, boolean z5, boolean z6) {
        return androidx.compose.foundation.layout.j1.e(androidx.compose.ui.unit.h.g((z4 || !z5) ? 4 : 8), 0.0f, androidx.compose.ui.unit.h.g(z6 ? 8 : 4), 0.0f, 10, null);
    }

    static /* synthetic */ androidx.compose.foundation.layout.l1 u(boolean z4, boolean z5, boolean z6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = false;
        }
        if ((i4 & 4) != 0) {
            z6 = false;
        }
        return t(z4, z5, z6);
    }
}
