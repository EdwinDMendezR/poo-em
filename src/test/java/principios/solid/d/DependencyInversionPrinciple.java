package principios.solid.d;

import org.junit.jupiter.api.Test;

import java.util.List;

public class DependencyInversionPrinciple {

    interface Database {
        void connect();
        void disconnect();
        void executeQuery(String query);
    }

    class MySQLDatabase implements Database {
        @Override
        public void connect() {
            //implementation
        }

        @Override
        public void disconnect() {
            //implementation
        }

        @Override
        public void executeQuery(String query) {
            //implementation
        }
    }

    class DataAccessObject {
        private Database database;

        public DataAccessObject(Database database) {
            this.database = database;
        }

        public void executeQuery(String query) {
            database.connect();
            database.executeQuery(query);
            database.disconnect();
        }
    }

}
