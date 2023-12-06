package Exercício01;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Datas {

    private int day;
    private int month;
    private int year;

    public Datas(int day, int month, int year) {
        if (validarData(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public Datas() {
        Date dataAtual = new Date(day);
        SimpleDateFormat sdfDia = new SimpleDateFormat("dd");
        SimpleDateFormat sdfMes = new SimpleDateFormat("MM");
        SimpleDateFormat sdfAno = new SimpleDateFormat("yyyy");

        this.day = Integer.parseInt(sdfDia.format(dataAtual));
        this.month = Integer.parseInt(sdfMes.format(dataAtual));
        this.year = Integer.parseInt(sdfAno.format(dataAtual));
    }

    public int getDia() {
        return day;
    }

    public void setDia(int day) {
        if (validarData(day, this.month, this.year)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Dia inválido");
        }
    }

    public int getMes() {
        return month;
    }

    public void setMes(int month) {
        if (validarData(this.day, month, this.year)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    public int getAno() {
        return year;
    }

    public void setAno(int year) {
        if (validarData(this.day, this.month, year)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Ano inválido");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    private boolean validarData(int day, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        cal.set(year, month - 1, day);

        try {
            cal.getTime();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void avancarRetroceder(int quantidadeDias) {
        Calendar cal = Calendar.getInstance();
        cal.set(this.year, this.month - 1, this.day);
        cal.add(Calendar.DAY_OF_MONTH, quantidadeDias);

        this.day = cal.get(Calendar.DAY_OF_MONTH);
        this.month = cal.get(Calendar.MONTH) + 1;
        this.year = cal.get(Calendar.YEAR);
    }
}

  