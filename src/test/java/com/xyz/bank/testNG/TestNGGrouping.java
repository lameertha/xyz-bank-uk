package com.xyz.bank.testNG;

import org.testng.annotations.Test;


    public class TestNGGrouping {
        @Test(groups = {"smoke","sanity"})
        public void BankTest(){

        }
        @Test(groups ={"smoke","regression","sanity"} )
        public void BankTest1(){

        }
        @Test(groups ={"smoke","regression","sanity"} )
        public void BankTest2(){

        }
        @Test(groups ={"smoke","regression","sanity"} )
        public void BankTest3(){

        }
        @Test(groups ={"smoke","regression","sanity"} )
        public void BankTest4(){

        }
        @Test(groups ={"smoke","regression","sanity"} )
        public void BankTest5(){

        }
    }

