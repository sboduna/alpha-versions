package murach.download;

/**
 * Created by somebody on 19.06.2017.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.locks.ReentrantLock;
import murach.beans.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UserIO {

    private static final ReentrantLock rwLock = new ReentrantLock();

    @Nullable
    public static User getUser(String emailAddress, String emailListPath)
            throws IOException {

        rwLock.lock();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(emailListPath))) {

            String buffer;
            User user;

            while ((buffer = reader.readLine()) != null) {
                user = readEmailRow(buffer);

                if (user.getEmail().equalsIgnoreCase(emailAddress))
                    return user;
            }
        } finally {
            rwLock.unlock();
        }

        return null;
    }

    public static void addUser(User user, String emailListPath)
        throws IOException {

        rwLock.lock();

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(emailListPath), StandardOpenOption.APPEND)) {
            writer
                .append(user.getEmail())
                .append(";")
                .append(user.getFirstName())
                .append(";")
                .append(user.getLastName());
        } finally {
            rwLock.unlock();
        }
    }

    @NotNull
    private static User readEmailRow(String inputRow) {
        String splitted[] = inputRow.split(";");

        String email = "";
        String firstName = "";
        String lastName = "";

        try {
            email = splitted[0];
            firstName = splitted[1];
            lastName = splitted[2];
        } catch (ArrayIndexOutOfBoundsException ignore) {
        }

        return new User(email, firstName, lastName);
    }
}
