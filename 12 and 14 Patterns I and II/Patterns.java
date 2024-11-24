public class Patterns {
    public static void main(String[] args) {
        // 1. HOLLOW RECTANGLE pattern
        System.out.println("1. HOLLOW RECTANGLE pattern");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // 2. INVERTED & ROTATED HALF-PYRAMID pattern
        System.out.println("\n2. INVERTED & ROTATED HALF-PYRAMID pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3. INVERTED HALF-PYRAMID with Numbers pattern
        System.out.println("\n3. INVERTED HALF-PYRAMID with Numbers pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 4. FLOYD'S Triangle pattern
        System.out.println("\n4. FLOYD'S Triangle pattern");
        int c = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }

        // 5. 0-1 Triangle pattern
        System.out.println("\n5. 0-1 Triangle pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // 6. BUTTERFLY pattern
        System.out.println("\n6. BUTTERFLY pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (n*2) - (i*2); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (n*2) - (i*2); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 7. SOLID RHOMBUS pattern.
        System.out.println("\n7. SOLID RHOMBUS pattern.");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 8. HOLLOW RHOMBUS pattern.
        System.out.println("\n8. HOLLOW RHOMBUS pattern.");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        // 9. DIAMOND pattern
        System.out.println("\n9. DIAMOND pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i*2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i*2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 10. NUMBER PYRAMID pattern.
        System.out.println("\n10. NUMBER PYRAMID pattern.");
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // 11. PALINDROMIC Pattern with Numbers pattern
        System.out.println("\n11. PALINDROMIC Pattern with Numbers pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 2; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
