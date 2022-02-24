package problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String u : urls) {
            if (isUrlValid(u)){
                sb.append(String.format("Browsing: %s", u));
            } else {
                sb.append("Invalid URL!");
            }

            sb.append(System.lineSeparator());
        }
            return sb.toString();

    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String n : numbers) {
            if (isNumberValid(n)) {
                sb.append(String.format("Calling... %s", n));

            } else {
                sb.append("Invalid number!");
            }

            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    private boolean isNumberValid(String number){
        for (int i = 0; i < number.length(); i++) {
            if(!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean isUrlValid(String url){
        Pattern pattern = Pattern.compile("[\\D]+$");
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
