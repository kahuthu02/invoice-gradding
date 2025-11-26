import java.util.Scanner;

public class invoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Capture Bill To and Ship To information ---
        System.out.println("Enter BILL TO name:");
        String billName = sc.nextLine();
        System.out.println("Enter BILL TO address (single line):");
        String billAddr = sc.nextLine();
        System.out.println("Enter BILL TO contact (phone/email):");
        String billContact = sc.nextLine();

        System.out.println("Enter SHIP TO name:");
        String shipName = sc.nextLine();
        System.out.println("Enter SHIP TO address (single line):");
        String shipAddr = sc.nextLine();
        System.out.println("Enter SHIP TO contact (phone/email):");
        String shipContact = sc.nextLine();

        // --- Product 1 ---
        System.out.println("\nPRODUCT 1 - Enter product code:");
        String code1 = sc.nextLine();
        System.out.println("PRODUCT 1 - Enter product name:");
        String name1 = sc.nextLine();
        System.out.println("PRODUCT 1 - Enter HSN code:");
        String hsn1 = sc.nextLine();
        System.out.println("PRODUCT 1 - Enter quantity (number):");
        double qty1 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 1 - Enter units (e.g. nos):");
        String units1 = sc.nextLine();
        System.out.println("PRODUCT 1 - Enter rate (per unit):");
        double rate1 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 1 - Enter tax percent (e.g. 5 for 5%):");
        double taxPerc1 = Double.parseDouble(sc.nextLine());

        // --- Product 2 ---
        System.out.println("\nPRODUCT 2 - Enter product code:");
        String code2 = sc.nextLine();
        System.out.println("PRODUCT 2 - Enter product name:");
        String name2 = sc.nextLine();
        System.out.println("PRODUCT 2 - Enter HSN code:");
        String hsn2 = sc.nextLine();
        System.out.println("PRODUCT 2 - Enter quantity (number):");
        double qty2 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 2 - Enter units (e.g. nos):");
        String units2 = sc.nextLine();
        System.out.println("PRODUCT 2 - Enter rate (per unit):");
        double rate2 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 2 - Enter tax percent (e.g. 5 for 5%):");
        double taxPerc2 = Double.parseDouble(sc.nextLine());

        // --- Product 3 ---
        System.out.println("\nPRODUCT 3 - Enter product code:");
        String code3 = sc.nextLine();
        System.out.println("PRODUCT 3 - Enter product name:");
        String name3 = sc.nextLine();
        System.out.println("PRODUCT 3 - Enter HSN code:");
        String hsn3 = sc.nextLine();
        System.out.println("PRODUCT 3 - Enter quantity (number):");
        double qty3 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 3 - Enter units (e.g. nos):");
        String units3 = sc.nextLine();
        System.out.println("PRODUCT 3 - Enter rate (per unit):");
        double rate3 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 3 - Enter tax percent (e.g. 5 for 5%):");
        double taxPerc3 = Double.parseDouble(sc.nextLine());

        // --- Product 4 ---
        System.out.println("\nPRODUCT 4 - Enter product code:");
        String code4 = sc.nextLine();
        System.out.println("PRODUCT 4 - Enter product name:");
        String name4 = sc.nextLine();
        System.out.println("PRODUCT 4 - Enter HSN code:");
        String hsn4 = sc.nextLine();
        System.out.println("PRODUCT 4 - Enter quantity (number):");
        double qty4 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 4 - Enter units (e.g. nos):");
        String units4 = sc.nextLine();
        System.out.println("PRODUCT 4 - Enter rate (per unit):");
        double rate4 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 4 - Enter tax percent (e.g. 5 for 5%):");
        double taxPerc4 = Double.parseDouble(sc.nextLine());

        // --- Product 5 ---
        System.out.println("\nPRODUCT 5 - Enter product code:");
        String code5 = sc.nextLine();
        System.out.println("PRODUCT 5 - Enter product name:");
        String name5 = sc.nextLine();
        System.out.println("PRODUCT 5 - Enter HSN code:");
        String hsn5 = sc.nextLine();
        System.out.println("PRODUCT 5 - Enter quantity (number):");
        double qty5 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 5 - Enter units (e.g. nos):");
        String units5 = sc.nextLine();
        System.out.println("PRODUCT 5 - Enter rate (per unit):");
        double rate5 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 5 - Enter tax percent (e.g. 5 for 5%):");
        double taxPerc5 = Double.parseDouble(sc.nextLine());

        // --- Product 6 ---
        System.out.println("\nPRODUCT 6 - Enter product code:");
        String code6 = sc.nextLine();
        System.out.println("PRODUCT 6 - Enter product name:");
        String name6 = sc.nextLine();
        System.out.println("PRODUCT 6 - Enter HSN code:");
        String hsn6 = sc.nextLine();
        System.out.println("PRODUCT 6 - Enter quantity (number):");
        double qty6 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 6 - Enter units (e.g. nos):");
        String units6 = sc.nextLine();
        System.out.println("PRODUCT 6 - Enter rate (per unit):");
        double rate6 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 6 - Enter tax percent (e.g. 5 for 5%):");
        double taxPerc6 = Double.parseDouble(sc.nextLine());

        // --- Product 7 ---
        System.out.println("\nPRODUCT 7 - Enter product code:");
        String code7 = sc.nextLine();
        System.out.println("PRODUCT 7 - Enter product name:");
        String name7 = sc.nextLine();
        System.out.println("PRODUCT 7 - Enter HSN code:");
        String hsn7 = sc.nextLine();
        System.out.println("PRODUCT 7 - Enter quantity (number):");
        double qty7 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 7 - Enter units (e.g. nos):");
        String units7 = sc.nextLine();
        System.out.println("PRODUCT 7 - Enter rate (per unit):");
        double rate7 = Double.parseDouble(sc.nextLine());
        System.out.println("PRODUCT 7 - Enter tax percent (e.g. 18 for 18%):");
        double taxPerc7 = Double.parseDouble(sc.nextLine());

        // --- Calculations: base, tax, amount for each line ---
        double base1 = qty1 * rate1;
        double taxAmt1 = base1 * (taxPerc1 / 100.0);
        double amount1 = base1 + taxAmt1;

        double base2 = qty2 * rate2;
        double taxAmt2 = base2 * (taxPerc2 / 100.0);
        double amount2 = base2 + taxAmt2;

        double base3 = qty3 * rate3;
        double taxAmt3 = base3 * (taxPerc3 / 100.0);
        double amount3 = base3 + taxAmt3;

        double base4 = qty4 * rate4;
        double taxAmt4 = base4 * (taxPerc4 / 100.0);
        double amount4 = base4 + taxAmt4;

        double base5 = qty5 * rate5;
        double taxAmt5 = base5 * (taxPerc5 / 100.0);
        double amount5 = base5 + taxAmt5;

        double base6 = qty6 * rate6;
        double taxAmt6 = base6 * (taxPerc6 / 100.0);
        double amount6 = base6 + taxAmt6;

        double base7 = qty7 * rate7;
        double taxAmt7 = base7 * (taxPerc7 / 100.0);
        double amount7 = base7 + taxAmt7;

        // Total and discount (discount = 0.6368% of total)
        double total = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;
        double discountRate = 0.006368; // 0.6368%
        double discount = total * discountRate;
        // Round discount to two decimals like in invoice
        discount = Math.round(discount * 100.0) / 100.0;
        double grandTotal = total - discount;

        // --- Print formatted invoice ---
        System.out.println("\n\n==================== SALES INVOICE ====================\n");
        System.out.println("BILL TO:");
        System.out.println(billName);
        System.out.println(billAddr);
        System.out.println(billContact);
        System.out.println("\nSHIP TO:");
        System.out.println(shipName);
        System.out.println(shipAddr);
        System.out.println(shipContact);

        System.out.println("\nPayment Date: 7 days from date of delivery    Payment Terms: 100% against invoice\n");

        // Table header
        String header = String.format("%-4s %-10s %-22s %-10s %8s %6s %10s %6s %12s",
                "S.No", "ProdCode", "Product Name", "HSN Code", "Quantity", "Units", "Rate", "Tax", "Amount");
        System.out.println(header);
        System.out.println("---------------------------------------------------------------------------------------------");

        // Rows (each formatted)
        System.out.println(String.format("%-4s %-10s %-22s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "1", code1, shorten(name1,22), hsn1, qty1, units1, rate1, taxPerc1, amount1));
        System.out.println(String.format("%-4s %-10s %-22s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "2", code2, shorten(name2,22), hsn2, qty2, units2, rate2, taxPerc2, amount2));
        System.out.println(String.format("%-4s %-10s %-22s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "3", code3, shorten(name3,22), hsn3, qty3, units3, rate3, taxPerc3, amount3));
        System.out.println(String.format("%-4s %-10s %-22s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "4", code4, shorten(name4,22), hsn4, qty4, units4, rate4, taxPerc4, amount4));
        System.out.println(String.format("%-4s %-10s %-22s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "5", code5, shorten(name5,22), hsn5, qty5, units5, rate5, taxPerc5, amount5));
        System.out.println(String.format("%-4s %-10s %-22s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "6", code6, shorten(name6,22), hsn6, qty6, units6, rate6, taxPerc6, amount6));
        System.out.println(String.format("%-4s %-10s %-22s %-10s %8.0f %6s %10.2f %5.0f%% %12.2f",
                "7", code7, shorten(name7,22), hsn7, qty7, units7, rate7, taxPerc7, amount7));

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println(String.format("%72s %12.2f", "Total", total));
        System.out.println(String.format("%72s %12.2f", "Discounts", discount));
        System.out.println(String.format("%72s %12.2f", "Grand total", grandTotal));

        sc.close();
    }

    private static String shorten(String s, int max) {
        if (s == null) return "";
        if (s.length() <= max) return s;
        return s.substring(0, max - 3) + "...";
    }
}

