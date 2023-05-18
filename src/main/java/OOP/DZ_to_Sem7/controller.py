import model, view
from colorama import init
from colorama import Fore, Back, Style

# 1. Функция заполнения записями структуры хранения данных (словарь). Возвращает список строк со значениями словаря
def add_records_in_dic() -> list:
    quantity_records = view.quantity_records()  # Определяем количество записей
    dictionary = {}
    for key in range(1, quantity_records + 1):
        record_tup = view.add_record_surname(), view.add_record_name(), view.add_record_telephon(), view.add_record_description()
        dictionary[key] = model.create_record(record_tup)
        print("\n")
    return list(dictionary.values())


# 2. Функция экспорта записей в файл и их вывода на экран с помощью Textable
def add_records_in_file_print_with_textable():
    records_lst = add_records_in_dic()
    model.export_to_file("telephone directory.txt", records_lst, delimiter=",")
    view.view_data(Fore.RED + Back.BLUE + "В файл записаны следующие записи:")
    records_str = model.parsing_lst_for_table(records_lst)
    records = records_str.split(",")
    model.rendering_list(records)
    return records_lst


# 3. Функция импорта записей из файла и их вывода на экран с помощью Textable
def take_records_from_file_with_textable():
    records_lst = model.import_from_file("telephone directory.txt")
    view.view_data(Fore.RED + Back.BLUE + "Из файла cчитаны следующие записи:")
    records_str = model.parsing_lst_for_table(records_lst)
    records = records_str.split(",")
    model.rendering_list(records)
    return records_lst


# 4. Функция добавления записей в файл с уже имеющимися записями и вывода на экран всех записей с учетом добавленных с помощью Textable
def add_records_in_file_with_available_records_with_textable():
    records_lst = add_records_in_dic()
    model.rewrite_to_file("telephone directory.txt", records_lst, delimiter=",")
    view.view_data(Fore.RED + Back.BLUE + "В файл дозаписаны следующие записи:")
    records_str = model.parsing_lst_for_table(records_lst)
    records = records_str.split(",")
    model.rendering_list(records)
    return records_lst
