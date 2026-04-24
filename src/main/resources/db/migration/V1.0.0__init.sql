create table patient (
    id bigint primary key auto_increment,
    run varchar(10) not null,
    name varchar(100) not null,
    last_name varchar(100) not null,
    birthday date,
    email varchar(100)
);

create table history_patient (
    id_history bigint primary key auto_increment,
    id_patient bigint not null,
    address varchar(255) not null,
    phone varchar(20) not null,
    blood_type varchar(3) not null
);

alter table history_patient
    add constraint fk_history_patient
    foreign key (id_patient) references patient(id);


insert into patient (run, name, last_name, birthday, email) values
('12345678-9', 'John', 'Doe', '1990-01-01', 'jhon@patient.com'),
('98765432-1', 'Jane', 'Smith', '1985-05-15', 'jane@patient.com'),
('45678912-3', 'Alice', 'Johnson', '1992-09-30', 'alice@patient.com'),
('78912345-6', 'Bob', 'Brown', '1988-12-20', 'bob@patient.com');



insert into history_patient (id_patient, address, phone, blood_type) values
(1, '123 Main St', '555-1234', 'A+'),
(2, '456 Elm St', '555-5678', 'O-'),
(3, '789 Oak St', '555-9012', 'B+'),
(4, '321 Pine St', '555-3456', 'AB-');