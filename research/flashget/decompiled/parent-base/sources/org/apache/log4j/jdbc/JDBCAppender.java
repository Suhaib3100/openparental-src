package org.apache.log4j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Appender;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class JDBCAppender extends AppenderSkeleton implements Appender {
    protected String databaseURL = "jdbc:odbc:myDB";
    protected String databaseUser = "me";
    protected String databasePassword = "mypassword";
    protected Connection connection = null;
    protected String sqlStatement = "";
    protected int bufferSize = 1;
    private boolean locationInfo = false;
    protected ArrayList buffer = new ArrayList(this.bufferSize);
    protected ArrayList removes = new ArrayList(this.bufferSize);

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        loggingEvent.getNDC();
        loggingEvent.getThreadName();
        loggingEvent.getMDCCopy();
        if (this.locationInfo) {
            loggingEvent.getLocationInformation();
        }
        loggingEvent.getRenderedMessage();
        loggingEvent.getThrowableStrRep();
        this.buffer.add(loggingEvent);
        if (this.buffer.size() >= this.bufferSize) {
            flushBuffer();
        }
    }

    @Override // org.apache.log4j.Appender
    public void close() {
        flushBuffer();
        try {
            Connection connection = this.connection;
            if (connection != null && !connection.isClosed()) {
                this.connection.close();
            }
        } catch (SQLException e4) {
            this.errorHandler.error("Error closing connection", e4, 0);
        }
        this.closed = true;
    }

    protected void closeConnection(Connection connection) {
    }

    protected void execute(String str) throws SQLException {
        Connection connection;
        Statement statement = null;
        try {
            connection = getConnection();
            try {
                statement = connection.createStatement();
                statement.executeUpdate(str);
                statement.close();
                closeConnection(connection);
            } catch (Throwable th) {
                th = th;
                if (statement != null) {
                    statement.close();
                }
                closeConnection(connection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            connection = null;
        }
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void finalize() {
        close();
    }

    public void flushBuffer() {
        this.removes.ensureCapacity(this.buffer.size());
        Iterator it = this.buffer.iterator();
        while (it.hasNext()) {
            LoggingEvent loggingEvent = (LoggingEvent) it.next();
            try {
                try {
                    execute(getLogStatement(loggingEvent));
                } catch (SQLException e4) {
                    this.errorHandler.error("Failed to excute sql", e4, 2);
                }
            } finally {
                this.removes.add(loggingEvent);
            }
        }
        this.buffer.removeAll(this.removes);
        this.removes.clear();
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    protected Connection getConnection() throws SQLException {
        if (!DriverManager.getDrivers().hasMoreElements()) {
            setDriver("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        if (this.connection == null) {
            this.connection = DriverManager.getConnection(this.databaseURL, this.databaseUser, this.databasePassword);
        }
        return this.connection;
    }

    public boolean getLocationInfo() {
        return this.locationInfo;
    }

    protected String getLogStatement(LoggingEvent loggingEvent) {
        return getLayout().format(loggingEvent);
    }

    public String getPassword() {
        return this.databasePassword;
    }

    public String getSql() {
        return this.sqlStatement;
    }

    public String getURL() {
        return this.databaseURL;
    }

    public String getUser() {
        return this.databaseUser;
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return true;
    }

    public void setBufferSize(int i4) {
        this.bufferSize = i4;
        this.buffer.ensureCapacity(i4);
        this.removes.ensureCapacity(this.bufferSize);
    }

    public void setDriver(String str) {
        try {
            Class.forName(str);
        } catch (Exception e4) {
            this.errorHandler.error("Failed to load driver", e4, 0);
        }
    }

    public void setLocationInfo(boolean z4) {
        this.locationInfo = z4;
    }

    public void setPassword(String str) {
        this.databasePassword = str;
    }

    public void setSql(String str) {
        this.sqlStatement = str;
        if (getLayout() == null) {
            setLayout(new PatternLayout(str));
        } else {
            ((PatternLayout) getLayout()).setConversionPattern(str);
        }
    }

    public void setURL(String str) {
        this.databaseURL = str;
    }

    public void setUser(String str) {
        this.databaseUser = str;
    }
}
