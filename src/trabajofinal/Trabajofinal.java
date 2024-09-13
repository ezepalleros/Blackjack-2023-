package trabajofinal;

import javax.swing.*;

class Trabajofinal {

	public static void main(String[] args) {
		int menu1, menu2, cartanum1, cartanumaq1, cartapalo1, cartapalomaq1, apuesta1, contador1 = 0, contador2 = 3,
				contador3 = 4, contamaq = 0;
		int[] cuentacartas = new int[20];
		int[] cuentacartasmaq = new int[20];
		String[] cartabuena = new String[10];
		String[] cartabuenamaq = new String[10];
		String cartanum2 = null, cartapalo2 = null, jugada = "1", cartanumaq2 = null, cartapalomaq2 = null;
		Boolean aprob1 = false, aprob2 = false, aprobmenu = false, aprobmenu2 = false, aprobmenu3 = false,
				aprobas = true, aprobotra = false, asenmano = false, contracroupier = false,
				irse = false, perdiste = false;

		do {
			do {
				
				
				perdiste = false;
				apuesta1 = 0;
				aprobmenu3 = false;
				aprobmenu2 = false;
				aprobmenu = false;
				contracroupier=false;
				contador1 = 0;
				contamaq = 0;
				asenmano = false;
				contador2 = 3;
				contador3 = 4;

				menu1 = Integer.parseInt((String) JOptionPane.showInputDialog(null,
						"¡Bienvenido al menú de Blackjack! Por favor, escriba el número de la sección que quiera ir",
						"Menú de Blackjack", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Trabajofinal.class.getResource("/img/menublackjack.png")), null, null));

				if (menu1 == 1 || menu1 == 2 || menu1 == 3) {
					aprobmenu = true;
				} else {
					JOptionPane.showMessageDialog(null, "Ingrese una de las opciones disponibles.");
				}

			} while (aprobmenu == false);

			switch (menu1) {
			case 1:

					apuesta1 = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Ingrese su apuesta.",
							"Menú de Blackjack", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Trabajofinal.class.getResource("/img/apuestablackjack.png")), null, null));

					JOptionPane.showMessageDialog(null,
							"¡Buena suerte! Recordá que tu objetivo es estar lo más cercano a 21.", "Blackjack",
							JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Trabajofinal.class.getResource("/img/empiezablackjack.png")));

					for (int i = 1; i != 3; i++) {

						cartanum1 = (int) (Math.random() * 13 + 1);

						switch (cartanum1) {
						case 1:
							cartanum2 = "as";
							break;
						case 2:
							cartanum2 = "dos";
							break;
						case 3:
							cartanum2 = "tres";
							break;
						case 4:
							cartanum2 = "cuatro";
							break;
						case 5:
							cartanum2 = "cinco";
							break;
						case 6:
							cartanum2 = "seis";
							break;
						case 7:
							cartanum2 = "siete";
							break;
						case 8:
							cartanum2 = "ocho";
							break;
						case 9:
							cartanum2 = "nueve";
							break;
						case 10:
							cartanum2 = "diez";
							break;
						case 11:
							cartanum2 = "jota";
							break;
						case 12:
							cartanum2 = "reina";
							break;
						case 13:
							cartanum2 = "rey";
							break;

						}

						cartapalo1 = (int) (Math.random() * 4 + 1);

						switch (cartapalo1) {
						case 1:
							cartapalo2 = "tréboles";
							break;
						case 2:
							cartapalo2 = "diamantes";
							break;
						case 3:
							cartapalo2 = "corazones";
							break;
						case 4:
							cartapalo2 = "picas";
							break;

						}

						cartabuena[i] = cartanum2 + " de " + cartapalo2;

						if (cartabuena[i].equals(cartabuena[i - 1])) {
							cartabuena[i] = null;
							cartanum2 = "nada";
							cartapalo2 = "nada";
							aprobotra = true;
							i = i - 1;
						}

						if (cartanum2.equalsIgnoreCase("as")) {
							contador1 = contador1 + 11;
							asenmano = true;
							cuentacartas[i] = cuentacartas[i] + 1;
						} else {
							if (cartanum2.equalsIgnoreCase("dos")) {
								contador1 = contador1 + 2;
								cuentacartas[i] = cuentacartas[i] + 2;
							} else {
								if (cartanum2.equalsIgnoreCase("tres")) {
									contador1 = contador1 + 3;
									cuentacartas[i] = cuentacartas[i] + 3;
								} else {
									if (cartanum2.equalsIgnoreCase("cuatro")) {
										contador1 = contador1 + 4;
										cuentacartas[i] = cuentacartas[i] + 4;
									} else {
										if (cartanum2.equalsIgnoreCase("cinco")) {
											contador1 = contador1 + 5;
											cuentacartas[i] = cuentacartas[i] + 5;
										} else {
											if (cartanum2.equalsIgnoreCase("seis")) {
												contador1 = contador1 + 6;
												cuentacartas[i] = cuentacartas[i] + 6;
											} else {
												if (cartanum2.equalsIgnoreCase("siete")) {
													contador1 = contador1 + 7;
													cuentacartas[i] = cuentacartas[i] + 7;
												} else {
													if (cartanum2.equalsIgnoreCase("ocho")) {
														contador1 = contador1 + 8;
														cuentacartas[i] = cuentacartas[i] + 8;
													} else {
														if (cartanum2.equalsIgnoreCase("nueve")) {
															contador1 = contador1 + 9;
															cuentacartas[i] = cuentacartas[i] + 9;
														} else {
															if (cartanum2.equalsIgnoreCase("diez")) {
																contador1 = contador1 + 10;
																cuentacartas[i] = cuentacartas[i] + 10;
															} else {
																if (cartanum2.equalsIgnoreCase("jota")) {
																	contador1 = contador1 + 10;
																	cuentacartas[i] = cuentacartas[i] + 11;
																} else {
																	if (cartanum2.equalsIgnoreCase("reina")) {
																		contador1 = contador1 + 10;
																		cuentacartas[i] = cuentacartas[i] + 12;
																	} else {
																		if (cartanum2.equalsIgnoreCase("rey")) {
																			contador1 = contador1 + 10;
																			cuentacartas[i] = cuentacartas[i] + 13;
																		}
																	}

																}
															}

														}
													}

												}

											}

										}
									}

								}
							}

						}

						if (cartapalo2.equalsIgnoreCase("tréboles")) {
							cuentacartas[i] = cuentacartas[i] + 100;
						} else {
							if (cartapalo2.equalsIgnoreCase("diamantes")) {
								cuentacartas[i] = cuentacartas[i] + 200;
							} else {
								if (cartapalo2.equalsIgnoreCase("corazones")) {
									cuentacartas[i] = cuentacartas[i] + 300;
								} else {
									if (cartapalo2.equalsIgnoreCase("picas")) {
										cuentacartas[i] = cuentacartas[i] + 400;
									}
								}
							}
						}

						if (aprobotra == false) {

							System.out.println(
									"Carta del jugador n" + i + ": " + cartabuena[i] + " numero " + cuentacartas[i]);

							JOptionPane.showMessageDialog(null,
									"La carta que te salió: \n \n" + cartabuena[i] + "\nContador: " + contador1,
									"Blackjack", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Trabajofinal.class.getResource("/img/" + cartabuena[i] + ".png")));
						} else {
							aprobotra = false;
						}

					}

					while (jugada.equalsIgnoreCase("1") && contador1 < 21) {
						do {

							jugada = (String) JOptionPane.showInputDialog(null, "Tu contador está en: " + contador1
									+ "\n¿Desea agarrar otra carta o quiere pasar el turno al croupier? \nPara agarrar otra carta, escriba 1. \nPara pasar el turno, escriba 2.",
									"Blackjack", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Trabajofinal.class.getResource("/img/quehaceblackjack.png")), null,
									null);

							if (jugada.equalsIgnoreCase("1") || jugada.equalsIgnoreCase("2")) {
								aprob1 = true;
							} else {
								JOptionPane.showMessageDialog(null, "Ingrese una de las opciones disponibles.");
							}

						} while (aprob1 == false);

						if (jugada.equalsIgnoreCase("1")) {

							for (int i = contador2; i != contador3; i++) {

								contador2++;

								cartanum1 = (int) (Math.random() * 13 + 1);

								switch (cartanum1) {
								case 1:
									cartanum2 = "as";
									break;
								case 2:
									cartanum2 = "dos";
									break;
								case 3:
									cartanum2 = "tres";
									break;
								case 4:
									cartanum2 = "cuatro";
									break;
								case 5:
									cartanum2 = "cinco";
									break;
								case 6:
									cartanum2 = "seis";
									break;
								case 7:
									cartanum2 = "siete";
									break;
								case 8:
									cartanum2 = "ocho";
									break;
								case 9:
									cartanum2 = "nueve";
									break;
								case 10:
									cartanum2 = "diez";
									break;
								case 11:
									cartanum2 = "jota";
									break;
								case 12:
									cartanum2 = "reina";
									break;
								case 13:
									cartanum2 = "rey";
									break;

								}

								cartapalo1 = (int) (Math.random() * 4 + 1);

								switch (cartapalo1) {
								case 1:
									cartapalo2 = "tréboles";
									break;
								case 2:
									cartapalo2 = "diamantes";
									break;
								case 3:
									cartapalo2 = "corazones";
									break;
								case 4:
									cartapalo2 = "picas";
									break;

								}

								cartabuena[i] = cartanum2 + " de " + cartapalo2;

								if (cartabuena[i].equals(cartabuena[i - 1])) {
									cartabuena[i] = null;
									cartanum2 = "nada";
									aprobotra = true;
									i = i - 1;
								}

								if (cartanum2.equalsIgnoreCase("as")) {
									contador1 = contador1 + 11;
									asenmano = true;
									cuentacartas[i] = cuentacartas[i] + 1;
								} else {
									if (cartanum2.equalsIgnoreCase("dos")) {
										contador1 = contador1 + 2;
										cuentacartas[i] = cuentacartas[i] + 2;
									} else {
										if (cartanum2.equalsIgnoreCase("tres")) {
											contador1 = contador1 + 3;
											cuentacartas[i] = cuentacartas[i] + 3;
										} else {
											if (cartanum2.equalsIgnoreCase("cuatro")) {
												contador1 = contador1 + 4;
												cuentacartas[i] = cuentacartas[i] + 4;
											} else {
												if (cartanum2.equalsIgnoreCase("cinco")) {
													contador1 = contador1 + 5;
													cuentacartas[i] = cuentacartas[i] + 5;
												} else {
													if (cartanum2.equalsIgnoreCase("seis")) {
														contador1 = contador1 + 6;
														cuentacartas[i] = cuentacartas[i] + 6;
													} else {
														if (cartanum2.equalsIgnoreCase("siete")) {
															contador1 = contador1 + 7;
															cuentacartas[i] = cuentacartas[i] + 7;
														} else {
															if (cartanum2.equalsIgnoreCase("ocho")) {
																contador1 = contador1 + 8;
																cuentacartas[i] = cuentacartas[i] + 8;
															} else {
																if (cartanum2.equalsIgnoreCase("nueve")) {
																	contador1 = contador1 + 9;
																	cuentacartas[i] = cuentacartas[i] + 9;
																} else {
																	if (cartanum2.equalsIgnoreCase("diez")) {
																		contador1 = contador1 + 10;
																		cuentacartas[i] = cuentacartas[i] + 10;
																	} else {
																		if (cartanum2.equalsIgnoreCase("jota")) {
																			contador1 = contador1 + 10;
																			cuentacartas[i] = cuentacartas[i] + 11;
																		} else {
																			if (cartanum2.equalsIgnoreCase("reina")) {
																				contador1 = contador1 + 10;
																				cuentacartas[i] = cuentacartas[i] + 12;
																			} else {
																				if (cartanum2.equalsIgnoreCase("rey")) {
																					contador1 = contador1 + 10;
																					cuentacartas[i] = cuentacartas[i]
																							+ 13;
																				}
																			}

																		}
																	}

																}
															}

														}

													}

												}
											}

										}
									}

								}

								if (cartapalo2.equalsIgnoreCase("tréboles")) {
									cuentacartas[i] = cuentacartas[i] + 100;
								} else {
									if (cartapalo2.equalsIgnoreCase("diamantes")) {
										cuentacartas[i] = cuentacartas[i] + 200;
									} else {
										if (cartapalo2.equalsIgnoreCase("corazones")) {
											cuentacartas[i] = cuentacartas[i] + 300;
										} else {
											if (cartapalo2.equalsIgnoreCase("picas")) {
												cuentacartas[i] = cuentacartas[i] + 400;
											}
										}
									}
								}

								if (contador1 >= 22 && aprobas == true && asenmano == true) {
									contador1 = contador1 - 10;
									aprobas = false;
								}

								if (aprobotra == false) {

									System.out.println("Carta del jugador n" + i + ": " + cartabuena[i] + " numero "
											+ cuentacartas[i]);

									JOptionPane.showMessageDialog(null,
											"La carta que te salió: \n \n" + cartabuena[i] + "\nContador: " + contador1,
											"Blackjack", JOptionPane.DEFAULT_OPTION, new ImageIcon(
													Trabajofinal.class.getResource("/img/" + cartabuena[i] + ".png")));
								} else {
									aprobotra = false;
								}

							}

							contador3++;
							aprob1 = false;

						}

					}

					if (contador1 >= 22) {
						perdiste = true;
						JOptionPane.showMessageDialog(null, "¡Perdiste! Te pasaste de 21. ¡Mejor suerte la próxima!",
								"Blackjack", JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Trabajofinal.class.getResource("/img/arriba21.png")));
					} else {
						if (contador1 <= 20) {
							JOptionPane.showMessageDialog(null,
									"¡Te quedaste! La suma de todas tus cartas da en total " + contador1
											+ ". \nSi el croupier queda debajo de tu suma o se pasa de 21. ¡Ganaste!",
									"Blackjack", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Trabajofinal.class.getResource("/img/vscroupier.png")));
							contracroupier = true;
						} else {
							if (contador1 == 21) {
								JOptionPane.showMessageDialog(null,
										"¡¡¡Increible!!! Hiciste Blackjack por sumar justo 21. Tu apuesta se multiplica por 3 y no tienes que jugar contra el croupier",
										"Blackjack", JOptionPane.DEFAULT_OPTION,
										new ImageIcon(Trabajofinal.class.getResource("/img/blackjack21.png")));
								apuesta1 = apuesta1 * 3;
							}

						}
					}

					asenmano = false;
					aprobotra = false;

					if (contracroupier == true) {

						for (int j = 1; contamaq <= 16; j++) {

							cartanumaq1 = (int) (Math.random() * 13 + 1);

							switch (cartanumaq1) {
							case 1:
								cartanumaq2 = "as";
								break;
							case 2:
								cartanumaq2 = "dos";
								break;
							case 3:
								cartanumaq2 = "tres";
								break;
							case 4:
								cartanumaq2 = "cuatro";
								break;
							case 5:
								cartanumaq2 = "cinco";
								break;
							case 6:
								cartanumaq2 = "seis";
								break;
							case 7:
								cartanumaq2 = "siete";
								break;
							case 8:
								cartanumaq2 = "ocho";
								break;
							case 9:
								cartanumaq2 = "nueve";
								break;
							case 10:
								cartanumaq2 = "diez";
								break;
							case 11:
								cartanumaq2 = "jota";
								break;
							case 12:
								cartanumaq2 = "reina";
								break;
							case 13:
								cartanumaq2 = "rey";
								break;

							}

							cartapalomaq1 = (int) (Math.random() * 4 + 1);

							switch (cartapalomaq1) {
							case 1:
								cartapalomaq2 = "tréboles";
								break;
							case 2:
								cartapalomaq2 = "diamantes";
								break;
							case 3:
								cartapalomaq2 = "corazones";
								break;
							case 4:
								cartapalomaq2 = "picas";
								break;

							}

							cartabuenamaq[j] = cartanumaq2 + " de " + cartapalomaq2;

							if (cartanumaq2.equalsIgnoreCase("as")) {
								contamaq = contamaq + 11;
								asenmano = true;
								cuentacartasmaq[j] = cuentacartasmaq[j] + 1;
							} else {
								if (cartanumaq2.equalsIgnoreCase("dos")) {
									contamaq = contamaq + 2;
									cuentacartasmaq[j] = cuentacartasmaq[j] + 2;
								} else {
									if (cartanumaq2.equalsIgnoreCase("tres")) {
										contamaq = contamaq + 3;
										cuentacartasmaq[j] = cuentacartasmaq[j] + 3;
									} else {
										if (cartanumaq2.equalsIgnoreCase("cuatro")) {
											contamaq = contamaq + 4;
											cuentacartasmaq[j] = cuentacartasmaq[j] + 4;
										} else {
											if (cartanumaq2.equalsIgnoreCase("cinco")) {
												contamaq = contamaq + 5;
												cuentacartasmaq[j] = cuentacartasmaq[j] + 5;
											} else {
												if (cartanumaq2.equalsIgnoreCase("seis")) {
													contamaq = contamaq + 6;
													cuentacartasmaq[j] = cuentacartasmaq[j] + 6;
												} else {
													if (cartanumaq2.equalsIgnoreCase("siete")) {
														contamaq = contamaq + 7;
														cuentacartasmaq[j] = cuentacartasmaq[j] + 7;
													} else {
														if (cartanumaq2.equalsIgnoreCase("ocho")) {
															contamaq = contamaq + 8;
															cuentacartasmaq[j] = cuentacartasmaq[j] + 8;
														} else {
															if (cartanumaq2.equalsIgnoreCase("nueve")) {
																contamaq = contamaq + 9;
																cuentacartasmaq[j] = cuentacartasmaq[j] + 9;
															} else {
																if (cartanumaq2.equalsIgnoreCase("diez")) {
																	contamaq = contamaq + 10;
																	cuentacartasmaq[j] = cuentacartasmaq[j] + 10;
																} else {
																	if (cartanumaq2.equalsIgnoreCase("jota")) {
																		contamaq = contamaq + 11;
																		cuentacartasmaq[j] = cuentacartasmaq[j] + 11;
																	} else {
																		if (cartanumaq2.equalsIgnoreCase("reina")) {
																			contamaq = contamaq + 12;
																			cuentacartasmaq[j] = cuentacartasmaq[j]
																					+ 12;
																		} else {
																			if (cartanumaq2.equalsIgnoreCase("rey")) {
																				contamaq = contamaq + 13;
																				cuentacartasmaq[j] = cuentacartasmaq[j]
																						+ 13;
																			}
																		}

																	}
																}

															}
														}

													}

												}

											}
										}

									}
								}

							}

							if (cartapalomaq2.equalsIgnoreCase("tréboles")) {
								cuentacartasmaq[j] = cuentacartasmaq[j] + 100;
							} else {
								if (cartapalomaq2.equalsIgnoreCase("diamantes")) {
									cuentacartasmaq[j] = cuentacartasmaq[j] + 200;
								} else {
									if (cartapalomaq2.equalsIgnoreCase("corazones")) {
										cuentacartasmaq[j] = cuentacartasmaq[j] + 300;
									} else {
										if (cartapalomaq2.equalsIgnoreCase("picas")) {
											cuentacartasmaq[j] = cuentacartasmaq[j] + 400;
										}
									}
								}
							}

							if (aprobotra == false) {

								System.out.println("Carta del croupier n" + j + ": " + cartabuenamaq[j] + " numero "
										+ cuentacartasmaq[j]);

								JOptionPane.showMessageDialog(null,
										"La carta que le salió al croupier: \n \n" + cartabuenamaq[j] + "\nContador: "
												+ contamaq,
										"Blackjack", JOptionPane.DEFAULT_OPTION, new ImageIcon(
												Trabajofinal.class.getResource("/img/" + cartabuenamaq[j] + ".png")));
							} else {
								aprobotra = false;
							}

						}
					}

					if (perdiste == true) {
						JOptionPane.showMessageDialog(null, "¡Te pasaste! Perdiste todo", "Blackjack",
								JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Trabajofinal.class.getResource("/img/perdistecroupier.png")));
					} else {
						if (contamaq <= 21 && contamaq > contador1) {
							JOptionPane.showMessageDialog(null, "¡El croupier juntó mas puntos! Perdiste todo",
									"Blackjack", JOptionPane.DEFAULT_OPTION,
									new ImageIcon(Trabajofinal.class.getResource("/img/perdistecroupier.png")));
							apuesta1 = 0;
						} else {
							if (contamaq == contador1) {
								JOptionPane.showMessageDialog(null,
										"¡Empate! No ganaste ni perdiste, te quedas con tus $" + apuesta1 + ".",
										"Blackjack", JOptionPane.DEFAULT_OPTION,
										new ImageIcon(Trabajofinal.class.getResource("/img/empatecroupier.png")));
							} else {
								if (contamaq >= 22) {
									apuesta1 = apuesta1 * 2;
									JOptionPane.showMessageDialog(null,
											"¡Se pasó el croupier! Recibiste el doble de tu apuesta, obteniendo un total de $"
													+ apuesta1 + ".",
											"Blackjack", JOptionPane.DEFAULT_OPTION,
											new ImageIcon(Trabajofinal.class.getResource("/img/ganastecroupier.png")));

								} else {
									if (contamaq <= 21 && contamaq < contador1) {
										apuesta1 = apuesta1 * 2;
										JOptionPane.showMessageDialog(null,
												"¡Le ganaste al croupier por puntaje! Recibiste el doble de tu apuesta, obteniendo un total de $"
														+ apuesta1 + ".",
												"Blackjack", JOptionPane.DEFAULT_OPTION, new ImageIcon(
														Trabajofinal.class.getResource("/img/ganastecroupier.png")));

									}
								}

							}

						}
					}

					do {

						menu2 = Integer.parseInt((String) JOptionPane.showInputDialog(null,
								"¡Fin del juego! \n \n  \nSi quiere volver al menú, escriba 1 \n \nSi quiere salir del juego, escriba 2.",
								"Menú de Blackjack", JOptionPane.DEFAULT_OPTION,
								new ImageIcon(Trabajofinal.class.getResource("/img/goblackjack.png")), null, null));

						if (menu2 == 1 || menu2 == 2) {
							aprobmenu2 = true;
						} else {
							JOptionPane.showMessageDialog(null, "Ingrese una de las opciones disponibles.");
						}

					} while (aprobmenu2 = false);

					if (menu2 == 2) {
						aprobmenu3 = true;
						irse = true;
					}

				break;
			case 2:
				JOptionPane.showMessageDialog(null,
						"CÓMO FUNCIONA BLACKJACK: \n \n \nEl objetivo es obtener una mano de cartas cuyo valor total sea lo más cercano posible a 21 puntos, sin pasarte de este número. \n \nEl croupier te repartirá dos cartas y desde ahí tenés que decirle si quieres otra carta o no. \n \nLas cartas numéricas tienen su valor, las figuras valen 10 y los ases vale 11 o 1, dependiendo de si te pasas de 21 por puntaje o no. \n \nPierdes si el croupier obtiene un puntaje mayor a vos sin pasarse de 21. \n \nUn truco: El croupier debe parar al obtener 17 o más en sus cartas.",
						"Blackjack", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Trabajofinal.class.getResource("/img/howtoblackjack.png")));

				break;
			case 3:

				irse = true;
				break;

			}
		} while (irse == false);
	}
}
