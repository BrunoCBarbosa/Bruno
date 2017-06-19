package univas.edu.br.trab.lab3.si3;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


public class Runner {

	public static void main(String[] args) {
		Relatorio chartBuilder = new Relatorio();

				//cria o gráfico
				JFreeChart chart = chartBuilder.createChart("Gráfico de Vendas");
				
				//salva a imagem do gráfico
				chartBuilder.saveToFile("gráficoDeLinha.jpeg", chart);

				//cria um painel
				ChartPanel chartPanel = new ChartPanel(chart);
				chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

				//cria uma janena
				ApplicationFrame frame = new ApplicationFrame("Gráfico PetShop");
				frame.setContentPane(chartPanel);
				frame.pack();
				RefineryUtilities.centerFrameOnScreen(frame);
				frame.setVisible(true);
			}


	}


