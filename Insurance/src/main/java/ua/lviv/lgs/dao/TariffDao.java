package ua.lviv.lgs.dao;

import java.util.List;


import ua.lviv.lgs.entity.Tariff;

public interface TariffDao {
void saveTariff(Tariff tariff);
void removeTariff(Tariff tariff);
List<Tariff> findAllTariff();
}
