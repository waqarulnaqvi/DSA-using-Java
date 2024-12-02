package com.company;

class inner{

        int outerx = 5;
        int outerx1;

        class testpt_4_inner_outerclass{
            int innerx = outerx;

               void show() {
                System.out.println("inner x" + innerx);
            }

            public static void main(String[] args) {
//           show();
            }
        }
    }

