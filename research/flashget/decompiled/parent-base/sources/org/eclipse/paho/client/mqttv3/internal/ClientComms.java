package org.eclipse.paho.client.mqttv3.internal;

import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.eclipse.paho.client.mqttv3.BufferedMessage;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttPingSender;
import org.eclipse.paho.client.mqttv3.MqttToken;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttConnack;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttConnect;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttDisconnect;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPublish;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes5.dex */
public class ClientComms {
    private static final byte CLOSED = 4;
    private static final byte CONNECTED = 0;
    private static final byte CONNECTING = 1;
    private static final byte DISCONNECTED = 3;
    private static final byte DISCONNECTING = 2;
    private CommsCallback callback;
    private IMqttAsyncClient client;
    private ClientState clientState;
    private MqttConnectOptions conOptions;
    private DisconnectedMessageBuffer disconnectedMessageBuffer;
    private ExecutorService executorService;
    private int networkModuleIndex;
    private NetworkModule[] networkModules;
    private MqttClientPersistence persistence;
    private MqttPingSender pingSender;
    private CommsReceiver receiver;
    private CommsSender sender;
    private CommsTokenStore tokenStore;
    public static String VERSION = "${project.version}";
    public static String BUILD_LEVEL = "L${build.level}";
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.internal.ClientComms";
    private static final Logger log = LoggerFactory.getLogger("org.eclipse.paho.client.mqttv3.internal.nls.logcat", ClientComms.class.getName());
    private boolean stoppingComms = false;
    private Object conLock = new Object();
    private boolean closePending = false;
    private boolean resting = false;
    private byte conState = 3;

    private class ConnectBG implements Runnable {
        ClientComms clientComms;
        MqttConnect conPacket;
        MqttToken conToken;
        private String threadName;

        ConnectBG(ClientComms clientComms, MqttToken mqttToken, MqttConnect mqttConnect, ExecutorService executorService) {
            this.clientComms = clientComms;
            this.conToken = mqttToken;
            this.conPacket = mqttConnect;
            this.threadName = "MQTT Con: " + ClientComms.this.getClient().getClientId();
        }

        @Override // java.lang.Runnable
        public void run() {
            MqttException createMqttException;
            Thread.currentThread().setName(this.threadName);
            ClientComms.log.fine(ClientComms.CLASS_NAME, "connectBG:run", "220");
            try {
                MqttDeliveryToken[] outstandingDelTokens = ClientComms.this.tokenStore.getOutstandingDelTokens();
                int i4 = 0;
                while (true) {
                    createMqttException = null;
                    if (i4 >= outstandingDelTokens.length) {
                        break;
                    }
                    outstandingDelTokens[i4].internalTok.setException(null);
                    i4++;
                }
                ClientComms.this.tokenStore.saveToken(this.conToken, this.conPacket);
                NetworkModule networkModule = ClientComms.this.networkModules[ClientComms.this.networkModuleIndex];
                networkModule.start();
                ClientComms.this.receiver = new CommsReceiver(this.clientComms, ClientComms.this.clientState, ClientComms.this.tokenStore, networkModule.getInputStream());
                ClientComms.this.receiver.start("MQTT Rec: " + ClientComms.this.getClient().getClientId(), ClientComms.this.executorService);
                ClientComms.this.sender = new CommsSender(this.clientComms, ClientComms.this.clientState, ClientComms.this.tokenStore, networkModule.getOutputStream());
                ClientComms.this.sender.start("MQTT Snd: " + ClientComms.this.getClient().getClientId(), ClientComms.this.executorService);
                ClientComms.this.callback.start("MQTT Call: " + ClientComms.this.getClient().getClientId(), ClientComms.this.executorService);
                ClientComms.this.internalSend(this.conPacket, this.conToken);
            } catch (MqttException e4) {
                ClientComms.log.fine(ClientComms.CLASS_NAME, "connectBG:run", "212", null, e4);
                createMqttException = e4;
            } catch (Exception e5) {
                ClientComms.log.fine(ClientComms.CLASS_NAME, "connectBG:run", "209", null, e5);
                createMqttException = ExceptionHelper.createMqttException(e5);
            }
            if (createMqttException != null) {
                ClientComms.this.shutdownConnection(this.conToken, createMqttException);
            }
        }

        void start() {
            ClientComms.this.executorService.execute(this);
        }
    }

    private class DisconnectBG implements Runnable {
        MqttDisconnect disconnect;
        long quiesceTimeout;
        private String threadName;
        MqttToken token;

        DisconnectBG(MqttDisconnect mqttDisconnect, long j4, MqttToken mqttToken, ExecutorService executorService) {
            this.disconnect = mqttDisconnect;
            this.quiesceTimeout = j4;
            this.token = mqttToken;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName(this.threadName);
            ClientComms.log.fine(ClientComms.CLASS_NAME, "disconnectBG:run", "221");
            ClientComms.this.clientState.quiesce(this.quiesceTimeout);
            try {
                ClientComms.this.internalSend(this.disconnect, this.token);
                this.token.internalTok.waitUntilSent();
            } catch (MqttException unused) {
            } catch (Throwable th) {
                this.token.internalTok.markComplete(null, null);
                ClientComms.this.shutdownConnection(this.token, null);
                throw th;
            }
            this.token.internalTok.markComplete(null, null);
            ClientComms.this.shutdownConnection(this.token, null);
        }

        void start() {
            this.threadName = "MQTT Disc: " + ClientComms.this.getClient().getClientId();
            ClientComms.this.executorService.execute(this);
        }
    }

    class ReconnectDisconnectedBufferCallback implements IDisconnectedBufferCallback {
        final String methodName;

        ReconnectDisconnectedBufferCallback(String str) {
            this.methodName = str;
        }

        @Override // org.eclipse.paho.client.mqttv3.internal.IDisconnectedBufferCallback
        public void publishBufferedMessage(BufferedMessage bufferedMessage) throws MqttException {
            if (!ClientComms.this.isConnected()) {
                ClientComms.log.fine(ClientComms.CLASS_NAME, this.methodName, "208");
                throw ExceptionHelper.createMqttException(32104);
            }
            while (ClientComms.this.clientState.getActualInFlight() >= ClientComms.this.clientState.getMaxInFlight() - 1) {
                Thread.yield();
            }
            ClientComms.log.fine(ClientComms.CLASS_NAME, this.methodName, "510", new Object[]{bufferedMessage.getMessage().getKey()});
            ClientComms.this.internalSend(bufferedMessage.getMessage(), bufferedMessage.getToken());
            ClientComms.this.clientState.unPersistBufferedMessage(bufferedMessage.getMessage());
        }
    }

    public ClientComms(IMqttAsyncClient iMqttAsyncClient, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ExecutorService executorService) throws MqttException {
        this.client = iMqttAsyncClient;
        this.persistence = mqttClientPersistence;
        this.pingSender = mqttPingSender;
        mqttPingSender.init(this);
        this.executorService = executorService;
        this.tokenStore = new CommsTokenStore(getClient().getClientId());
        this.callback = new CommsCallback(this);
        ClientState clientState = new ClientState(mqttClientPersistence, this.tokenStore, this.callback, this, mqttPingSender);
        this.clientState = clientState;
        this.callback.setClientState(clientState);
        log.setResourceName(getClient().getClientId());
    }

    private MqttToken handleOldTokens(MqttToken mqttToken, MqttException mqttException) {
        log.fine(CLASS_NAME, "handleOldTokens", "222");
        MqttToken mqttToken2 = null;
        if (mqttToken != null) {
            try {
                if (this.tokenStore.getToken(mqttToken.internalTok.getKey()) == null) {
                    this.tokenStore.saveToken(mqttToken, mqttToken.internalTok.getKey());
                }
            } catch (Exception unused) {
            }
        }
        Enumeration elements = this.clientState.resolveOldTokens(mqttException).elements();
        while (elements.hasMoreElements()) {
            MqttToken mqttToken3 = (MqttToken) elements.nextElement();
            if (!mqttToken3.internalTok.getKey().equals("Disc") && !mqttToken3.internalTok.getKey().equals("Con")) {
                this.callback.asyncOperationComplete(mqttToken3);
            }
            mqttToken2 = mqttToken3;
        }
        return mqttToken2;
    }

    private void handleRunException(Exception exc) {
        log.fine(CLASS_NAME, "handleRunException", "804", null, exc);
        shutdownConnection(null, !(exc instanceof MqttException) ? new MqttException(32109, exc) : (MqttException) exc);
    }

    private void shutdownExecutorService() {
        this.executorService.shutdown();
        try {
            ExecutorService executorService = this.executorService;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(1L, timeUnit)) {
                return;
            }
            this.executorService.shutdownNow();
            if (this.executorService.awaitTermination(1L, timeUnit)) {
                return;
            }
            log.fine(CLASS_NAME, "shutdownExecutorService", "executorService did not terminate");
        } catch (InterruptedException unused) {
            this.executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public MqttToken checkForActivity() {
        return checkForActivity(null);
    }

    public void close(boolean z4) throws MqttException {
        synchronized (this.conLock) {
            try {
                if (!isClosed()) {
                    if (!isDisconnected() || z4) {
                        log.fine(CLASS_NAME, "close", "224");
                        if (isConnecting()) {
                            throw new MqttException(32110);
                        }
                        if (isConnected()) {
                            throw ExceptionHelper.createMqttException(32100);
                        }
                        if (isDisconnecting()) {
                            this.closePending = true;
                            return;
                        }
                    }
                    this.conState = (byte) 4;
                    shutdownExecutorService();
                    this.clientState.close();
                    this.clientState = null;
                    this.callback = null;
                    this.persistence = null;
                    this.sender = null;
                    this.pingSender = null;
                    this.receiver = null;
                    this.networkModules = null;
                    this.conOptions = null;
                    this.tokenStore = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void connect(MqttConnectOptions mqttConnectOptions, MqttToken mqttToken) throws MqttException {
        synchronized (this.conLock) {
            try {
                if (!isDisconnected() || this.closePending) {
                    log.fine(CLASS_NAME, "connect", "207", new Object[]{new Byte(this.conState)});
                    if (isClosed() || this.closePending) {
                        throw new MqttException(32111);
                    }
                    if (isConnecting()) {
                        throw new MqttException(32110);
                    }
                    if (!isDisconnecting()) {
                        throw ExceptionHelper.createMqttException(32100);
                    }
                    throw new MqttException(32102);
                }
                log.fine(CLASS_NAME, "connect", "214");
                this.conState = (byte) 1;
                this.conOptions = mqttConnectOptions;
                MqttConnect mqttConnect = new MqttConnect(this.client.getClientId(), this.conOptions.getMqttVersion(), this.conOptions.isCleanSession(), this.conOptions.getKeepAliveInterval(), this.conOptions.getUserName(), this.conOptions.getPassword(), this.conOptions.getWillMessage(), this.conOptions.getWillDestination());
                this.clientState.setKeepAliveSecs(this.conOptions.getKeepAliveInterval());
                this.clientState.setCleanSession(this.conOptions.isCleanSession());
                this.clientState.setMaxInflight(this.conOptions.getMaxInflight());
                this.tokenStore.open();
                new ConnectBG(this, mqttToken, mqttConnect, this.executorService).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void connectComplete(MqttConnack mqttConnack, MqttException mqttException) throws MqttException {
        int returnCode = mqttConnack.getReturnCode();
        synchronized (this.conLock) {
            try {
                if (returnCode != 0) {
                    log.fine(CLASS_NAME, "connectComplete", "204", new Object[]{new Integer(returnCode)});
                    throw mqttException;
                }
                log.fine(CLASS_NAME, "connectComplete", "215");
                this.conState = (byte) 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void deleteBufferedMessage(int i4) {
        this.disconnectedMessageBuffer.deleteMessage(i4);
    }

    protected void deliveryComplete(MqttPublish mqttPublish) throws MqttPersistenceException {
        this.clientState.deliveryComplete(mqttPublish);
    }

    public void disconnect(MqttDisconnect mqttDisconnect, long j4, MqttToken mqttToken) throws MqttException {
        synchronized (this.conLock) {
            try {
                if (isClosed()) {
                    log.fine(CLASS_NAME, "disconnect", "223");
                    throw ExceptionHelper.createMqttException(32111);
                }
                if (isDisconnected()) {
                    log.fine(CLASS_NAME, "disconnect", "211");
                    throw ExceptionHelper.createMqttException(32101);
                }
                if (isDisconnecting()) {
                    log.fine(CLASS_NAME, "disconnect", "219");
                    throw ExceptionHelper.createMqttException(32102);
                }
                if (Thread.currentThread() == this.callback.getThread()) {
                    log.fine(CLASS_NAME, "disconnect", "210");
                    throw ExceptionHelper.createMqttException(32107);
                }
                log.fine(CLASS_NAME, "disconnect", "218");
                this.conState = (byte) 2;
                new DisconnectBG(mqttDisconnect, j4, mqttToken, this.executorService).start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void disconnectForcibly(long j4, long j5) throws MqttException {
        disconnectForcibly(j4, j5, true);
    }

    public int getActualInFlight() {
        return this.clientState.getActualInFlight();
    }

    public MqttMessage getBufferedMessage(int i4) {
        return ((MqttPublish) this.disconnectedMessageBuffer.getMessage(i4).getMessage()).getMessage();
    }

    public int getBufferedMessageCount() {
        return this.disconnectedMessageBuffer.getMessageCount();
    }

    public IMqttAsyncClient getClient() {
        return this.client;
    }

    public ClientState getClientState() {
        return this.clientState;
    }

    public MqttConnectOptions getConOptions() {
        return this.conOptions;
    }

    public Properties getDebug() {
        Properties properties = new Properties();
        properties.put("conState", new Integer(this.conState));
        properties.put("serverURI", getClient().getServerURI());
        properties.put("callback", this.callback);
        properties.put("stoppingComms", new Boolean(this.stoppingComms));
        return properties;
    }

    public long getKeepAlive() {
        return this.clientState.getKeepAlive();
    }

    public int getNetworkModuleIndex() {
        return this.networkModuleIndex;
    }

    public NetworkModule[] getNetworkModules() {
        return this.networkModules;
    }

    public MqttDeliveryToken[] getPendingDeliveryTokens() {
        return this.tokenStore.getOutstandingDelTokens();
    }

    CommsReceiver getReceiver() {
        return this.receiver;
    }

    protected MqttTopic getTopic(String str) {
        return new MqttTopic(str, this);
    }

    void internalSend(MqttWireMessage mqttWireMessage, MqttToken mqttToken) throws MqttException {
        Logger logger = log;
        String str = CLASS_NAME;
        logger.fine(str, "internalSend", "200", new Object[]{mqttWireMessage.getKey(), mqttWireMessage, mqttToken});
        if (mqttToken.getClient() != null) {
            logger.fine(str, "internalSend", "213", new Object[]{mqttWireMessage.getKey(), mqttWireMessage, mqttToken});
            throw new MqttException(32201);
        }
        mqttToken.internalTok.setClient(getClient());
        try {
            this.clientState.send(mqttWireMessage, mqttToken);
        } catch (MqttException e4) {
            if (mqttWireMessage instanceof MqttPublish) {
                this.clientState.undo((MqttPublish) mqttWireMessage);
            }
            throw e4;
        }
    }

    public boolean isClosed() {
        boolean z4;
        synchronized (this.conLock) {
            z4 = this.conState == 4;
        }
        return z4;
    }

    public boolean isConnected() {
        boolean z4;
        synchronized (this.conLock) {
            z4 = this.conState == 0;
        }
        return z4;
    }

    public boolean isConnecting() {
        boolean z4;
        synchronized (this.conLock) {
            z4 = true;
            if (this.conState != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    public boolean isDisconnected() {
        boolean z4;
        synchronized (this.conLock) {
            z4 = this.conState == 3;
        }
        return z4;
    }

    public boolean isDisconnecting() {
        boolean z4;
        synchronized (this.conLock) {
            z4 = this.conState == 2;
        }
        return z4;
    }

    public boolean isResting() {
        boolean z4;
        synchronized (this.conLock) {
            z4 = this.resting;
        }
        return z4;
    }

    public void messageArrivedComplete(int i4, int i5) throws MqttException {
        this.callback.messageArrivedComplete(i4, i5);
    }

    public void notifyConnect() {
        if (this.disconnectedMessageBuffer != null) {
            log.fine(CLASS_NAME, "notifyConnect", "509");
            this.disconnectedMessageBuffer.setPublishCallback(new ReconnectDisconnectedBufferCallback("notifyConnect"));
            this.executorService.execute(this.disconnectedMessageBuffer);
        }
    }

    public void removeMessageListener(String str) {
        this.callback.removeMessageListener(str);
    }

    public void sendNoWait(MqttWireMessage mqttWireMessage, MqttToken mqttToken) throws MqttException {
        if (!isConnected() && ((isConnected() || !(mqttWireMessage instanceof MqttConnect)) && (!isDisconnecting() || !(mqttWireMessage instanceof MqttDisconnect)))) {
            if (this.disconnectedMessageBuffer == null) {
                log.fine(CLASS_NAME, "sendNoWait", "208");
                throw ExceptionHelper.createMqttException(32104);
            }
            log.fine(CLASS_NAME, "sendNoWait", "508", new Object[]{mqttWireMessage.getKey()});
            if (this.disconnectedMessageBuffer.isPersistBuffer()) {
                this.clientState.persistBufferedMessage(mqttWireMessage);
            }
            this.disconnectedMessageBuffer.putMessage(mqttWireMessage, mqttToken);
            return;
        }
        DisconnectedMessageBuffer disconnectedMessageBuffer = this.disconnectedMessageBuffer;
        if (disconnectedMessageBuffer == null || disconnectedMessageBuffer.getMessageCount() == 0) {
            internalSend(mqttWireMessage, mqttToken);
            return;
        }
        log.fine(CLASS_NAME, "sendNoWait", "507", new Object[]{mqttWireMessage.getKey()});
        if (this.disconnectedMessageBuffer.isPersistBuffer()) {
            this.clientState.persistBufferedMessage(mqttWireMessage);
        }
        this.disconnectedMessageBuffer.putMessage(mqttWireMessage, mqttToken);
    }

    public void setCallback(MqttCallback mqttCallback) {
        this.callback.setCallback(mqttCallback);
    }

    public void setDisconnectedMessageBuffer(DisconnectedMessageBuffer disconnectedMessageBuffer) {
        this.disconnectedMessageBuffer = disconnectedMessageBuffer;
    }

    public void setManualAcks(boolean z4) {
        this.callback.setManualAcks(z4);
    }

    public void setMessageListener(String str, IMqttMessageListener iMqttMessageListener) {
        this.callback.setMessageListener(str, iMqttMessageListener);
    }

    public void setNetworkModuleIndex(int i4) {
        this.networkModuleIndex = i4;
    }

    public void setNetworkModules(NetworkModule[] networkModuleArr) {
        this.networkModules = networkModuleArr;
    }

    public void setReconnectCallback(MqttCallbackExtended mqttCallbackExtended) {
        this.callback.setReconnectCallback(mqttCallbackExtended);
    }

    public void setRestingState(boolean z4) {
        this.resting = z4;
    }

    public void shutdownConnection(MqttToken mqttToken, MqttException mqttException) {
        CommsCallback commsCallback;
        MqttClientPersistence mqttClientPersistence;
        NetworkModule networkModule;
        synchronized (this.conLock) {
            try {
                if (!this.stoppingComms && !this.closePending && !isClosed()) {
                    this.stoppingComms = true;
                    log.fine(CLASS_NAME, "shutdownConnection", "216");
                    boolean z4 = isConnected() || isDisconnecting();
                    this.conState = (byte) 2;
                    if (mqttToken != null && !mqttToken.isComplete()) {
                        mqttToken.internalTok.setException(mqttException);
                    }
                    CommsCallback commsCallback2 = this.callback;
                    if (commsCallback2 != null) {
                        commsCallback2.stop();
                    }
                    CommsReceiver commsReceiver = this.receiver;
                    if (commsReceiver != null) {
                        commsReceiver.stop();
                    }
                    try {
                        NetworkModule[] networkModuleArr = this.networkModules;
                        if (networkModuleArr != null && (networkModule = networkModuleArr[this.networkModuleIndex]) != null) {
                            networkModule.stop();
                        }
                    } catch (Exception unused) {
                    }
                    this.tokenStore.quiesce(new MqttException(32102));
                    MqttToken handleOldTokens = handleOldTokens(mqttToken, mqttException);
                    try {
                        this.clientState.disconnected(mqttException);
                        if (this.clientState.getCleanSession()) {
                            this.callback.removeMessageListeners();
                        }
                    } catch (Exception unused2) {
                    }
                    CommsSender commsSender = this.sender;
                    if (commsSender != null) {
                        commsSender.stop();
                    }
                    MqttPingSender mqttPingSender = this.pingSender;
                    if (mqttPingSender != null) {
                        mqttPingSender.stop();
                    }
                    try {
                        if (this.disconnectedMessageBuffer == null && (mqttClientPersistence = this.persistence) != null) {
                            mqttClientPersistence.close();
                        }
                    } catch (Exception unused3) {
                    }
                    synchronized (this.conLock) {
                        log.fine(CLASS_NAME, "shutdownConnection", "217");
                        this.conState = (byte) 3;
                        this.stoppingComms = false;
                    }
                    boolean z5 = handleOldTokens != null;
                    CommsCallback commsCallback3 = this.callback;
                    if (z5 & (commsCallback3 != null)) {
                        commsCallback3.asyncOperationComplete(handleOldTokens);
                    }
                    if (z4 && (commsCallback = this.callback) != null) {
                        commsCallback.connectionLost(mqttException);
                    }
                    synchronized (this.conLock) {
                        if (this.closePending) {
                            try {
                                close(true);
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public MqttToken checkForActivity(IMqttActionListener iMqttActionListener) {
        try {
            return this.clientState.checkForActivity(iMqttActionListener);
        } catch (MqttException e4) {
            handleRunException(e4);
            return null;
        } catch (Exception e5) {
            handleRunException(e5);
            return null;
        }
    }

    protected void deliveryComplete(int i4) throws MqttPersistenceException {
        this.clientState.deliveryComplete(i4);
    }

    public void disconnectForcibly(long j4, long j5, boolean z4) throws MqttException {
        ClientState clientState = this.clientState;
        if (clientState != null) {
            clientState.quiesce(j4);
        }
        MqttToken mqttToken = new MqttToken(this.client.getClientId());
        if (z4) {
            try {
                internalSend(new MqttDisconnect(), mqttToken);
                mqttToken.waitForCompletion(j5);
            } catch (Exception unused) {
            } catch (Throwable th) {
                mqttToken.internalTok.markComplete(null, null);
                shutdownConnection(mqttToken, null);
                throw th;
            }
        }
        mqttToken.internalTok.markComplete(null, null);
        shutdownConnection(mqttToken, null);
    }
}
