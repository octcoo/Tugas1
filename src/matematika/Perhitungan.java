/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

/**
 *
 * @author HP
 */
class Perhitungan {
    double luastabung(double a, double b){
            return (2*3.14*a*b) + (2*3.14*Math.pow(a, 2));}
    double volumetabung (double c, double d){
            return 3.14*Math.pow(c,2)*d;}
    double luaskerucut(double e, double f){
            return (3.14*e*f) + (3.14*Math.pow(e, 2));}
    double volumekerucut(double g, double h){
            return (3.14*Math.pow(g, 2)*h)/3;}
    double luasbola(double i){
            return (4*3.14*Math.pow(i, 2));}
    double volumebola(double j){
            return (4/3*3.14*Math.pow(j, 3));}
}
