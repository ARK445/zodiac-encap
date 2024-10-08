import java.time.LocalDate;

public class zodiacSign {
    private String zodiacSign;
    private int luckyNumber;
    private String loveLife;
    private String destiny;
    
    // Constructor
    public zodiacSign(LocalDate birthDate) {
        this.zodiacSign = determineZodiac(birthDate);
        setZodiacGuides();
    }

    // Method to determine zodiac sign
    private String determineZodiac(LocalDate birthDate) {
        int day = birthDate.getDayOfMonth();
        int month = birthDate.getMonthValue();

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else {
            return "Capricorn";
        }
    }

    // Method to set zodiac guides (destiny, lucky number, love life)
    private void setZodiacGuides() {
        switch (zodiacSign) {
            case "Aquarius":
                this.luckyNumber = 4;
                this.loveLife = "A great time for deep connections.";
                this.destiny = "Creative and independent.";
                break;
            case "Pisces":
                this.luckyNumber = 7;
                this.loveLife = "Romantic opportunities ahead.";
                this.destiny = "Empathetic and wise.";
                break;
            case "Aries":
                this.luckyNumber = 9;
                this.loveLife = "Passion and excitement are in store.";
                this.destiny = "Energetic and adventurous.";
                break;
            case "Taurus":
                this.luckyNumber = 6;
                this.loveLife = "A steady and loyal romance.";
                this.destiny = "Practical and determined.";
                break;
            case "Gemini":
                this.luckyNumber = 5;
                this.loveLife = "Expect exciting new relationships.";
                this.destiny = "Curious and adaptable.";
                break;
            case "Cancer":
                this.luckyNumber = 2;
                this.loveLife = "Emotional depth in relationships.";
                this.destiny = "Caring and intuitive.";
                break;
            case "Leo":
                this.luckyNumber = 1;
                this.loveLife = "Romance filled with warmth and drama.";
                this.destiny = "Bold and charismatic.";
                break;
            case "Virgo":
                this.luckyNumber = 3;
                this.loveLife = "A time for meaningful connections.";
                this.destiny = "Analytical and perfectionist.";
                break;
            case "Libra":
                this.luckyNumber = 8;
                this.loveLife = "A balance between love and harmony.";
                this.destiny = "Charming and diplomatic.";
                break;
            case "Scorpio":
                this.luckyNumber = 11;
                this.loveLife = "Intense emotional bonds.";
                this.destiny = "Passionate and transformative.";
                break;
            case "Sagittarius":
                this.luckyNumber = 12;
                this.loveLife = "Freedom in relationships.";
                this.destiny = "Optimistic and freedom-loving.";
                break;
            case "Capricorn":
                this.luckyNumber = 10;
                this.loveLife = "A serious and committed romance.";
                this.destiny = "Ambitious and disciplined.";
                break;
            default:
                this.luckyNumber = 0;
                this.loveLife = "Full of surprises!";
                this.destiny = "Hardworking and ambitious.";
                break;
        }
    }

    // Getters
    public String getZodiacSign() {
        return zodiacSign;
    }

    public int getLuckyNumber() {
        return luckyNumber;
    }

    public String getLoveLife() {
        return loveLife;
    }

    public String getDestiny() {
        return destiny;
    }
}
