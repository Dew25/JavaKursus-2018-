/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Melnikov
 */
@Entity
public class MyEntity1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int n1;
    private int n2;
    private int res;
    private int count;

    public MyEntity1() {
    }

    public MyEntity1(int n1, int n2, int res, int count) {
        this.n1 = n1;
        this.n2 = n2;
        this.res = res;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "MyEntity1{" + "id=" + id + ", n1=" + n1 + ", n2=" + n2 + ", res=" + res + ", count=" + count + '}';
    }
    
    public String tableLine(){
        return "<tr><td>"+ id + "</td><td>" + n1 + "</td><td>" + n2 + "</td><td>" + 
                          res + "</td><td>" + count + "</td></tr>";    
    }
    
}
