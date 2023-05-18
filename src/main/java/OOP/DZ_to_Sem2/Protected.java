package OOP.DZ_to_Sem2;


import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public final class Protected {
    private final String[] username;
    private final String card;
    private final Integer password;

    public Protected(String @NotNull [] username, String card, Integer password) {
        this.username = username.clone();
        this.card = card;
        this.password = password;
    }

    public String @NotNull [] getUsername() {
        return username.clone();
    }

    public String getCard() {
        return card;
    }

    public Integer getPassword() {
        return password;
    }

    @Override
    public @NotNull String toString() {
        return "\nИМЯ:            \t" + Arrays.toString(username) +
                "\nНОМЕР КАРТЫ:   \t" + card +
                "\nПАРОЛЬ:        \t" + password;
    }
}
